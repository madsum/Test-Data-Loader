package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "shipment_event_type")
public class ShipmentEventType {

    @Id
    @Size(max = 4)
    @Column(name = "shipment_event_type_code")
    private String shipmentEventTypeCode;

    @Column(name = "shipment_event_type_name")
    @Size(max = 30)
    public String shipmentEventTypeName;

    @Column(name = "shipment_event_type_description")
    @Size(max = 250)
    public  String shipmentEventTypeDescription;
}
