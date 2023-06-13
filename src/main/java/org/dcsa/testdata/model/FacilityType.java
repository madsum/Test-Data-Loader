package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "facility_type")
public class FacilityType {

    @Id
    @Size(max = 4)
    @Column(name = "facility_type_code")
    private String facilityTypeCode;

    @Size(max = 100)
    @Column(name = "facility_type_name")
    private String facilityTypeName;

    @Size(max = 250)
    @Column(name = "facility_type_description")
    private String facilityTypeDescription;
}
