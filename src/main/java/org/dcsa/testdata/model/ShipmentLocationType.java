package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "shipment_location_type")
public class ShipmentLocationType {

    @Id
    @Size(max = 3)
    @Column(name = "location_type_code")
    private String locationTypeCode;

    @Size(max = 50)
    @Column(name = "location_type_description")
    private String locationTypeDescription;
}
