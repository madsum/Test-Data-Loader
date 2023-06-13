package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@NoArgsConstructor
@Data
@Table(schema = "seal")
@Entity
public class Seal {

    @Id
    @Column(name = "id")
    private UUID id;

    @JsonProperty("shipmentEquipmentId")
    @Column(name = "shipment_equipment_id")
    @NotNull
    private UUID shipmentEquipmentId;

    @JsonProperty("sealNumber")
    @Column(name = "seal_number")
    @Size(max = 15)
    @NotNull
    private String sealNumber;

    @JsonProperty("sealSource")
    @Column(name = "seal_source_code")
    @Size(max = 5)
    private String sealSource;

    @JsonProperty("sealType")
    @Column(name = "seal_type_code")
    @Size(max = 5)
    @NotNull
    private String sealType;

}

