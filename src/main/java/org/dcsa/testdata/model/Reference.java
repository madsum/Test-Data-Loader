package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dcsa.testdata.model.enums.ReferenceTypeCode;
import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table(schema = "reference")
@NoArgsConstructor
@Data
public class Reference {

    @Id
    @Column(name = "id")
    private UUID referenceID;

    @JsonProperty("referenceType")
    @Column(name = "reference_type_code")
    @NotNull
    private ReferenceTypeCode referenceType;

    @Size(max = 100)
    @NotNull
    @JsonProperty("referenceValue")
    private String referenceValue;

    @JsonProperty("shippingInstructionID")
    @Column(name = "shipping_instruction_id")
    private UUID shippingInstructionID;

    @JsonProperty("shipmentID")
    @Column(name = "shipment_id")
    private String shipmentID;

    @Column(name = "booking_id")
    @JsonIgnore
    private UUID bookingID;

    @Column(name = "consignment_item_id")
    private UUID consignmentItemID;

    @Transient
    @Column(name = "cargo_item_id")
    private UUID cargoItemID;
}

