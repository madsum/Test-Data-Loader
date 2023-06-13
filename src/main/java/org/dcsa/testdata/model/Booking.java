package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "carrier_booking_reference")
    @Size(max = 35)
    private String id;
    @JoinColumn(name = "receipt_delivery_type", nullable = false)
    @Column(name = "receipt_delivery_type_at_origin")
    private String receiptDeliveryTypeAtOrigin;
    @JoinColumn(name = "receipt_delivery_type", nullable = false)
    @Column(name = "receipt_delivery_type_at_destination")
    private String receiptDeliveryTypeAtDestination;
    @JoinColumn(name = "cargo_movement_type", nullable = false)
    @Column(name = "cargo_movement_type_at_origin")
    private String cargoMovementTypeAtOrigin;
    @JoinColumn(name = "cargo_movement_type", nullable = false)
    @Column(name = "cargo_movement_type_at_destination")
    private String cargoMovementTypeAtDestination;
    @Column(name = "booking_request_datetime")
    private String bookingDateTime;
    @Column(name = "service_contract")
    @Size(max = 30)
    private String serviceContract;
    @Column(name = "cargo_gross_weight")
    private Float cargoGrossWeight;
    @Column(name = "cargo_gross_weight_unit")
    @Size(  max = 3)
    private String cargoGrossWeightUnit;
    @Column(name = "commodity_type")
    @Size(max = 20)
    private String commodityType;
}
