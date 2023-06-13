package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "un_location")
public class UnLocation {

    @Id
    @Column(name = "un_location_code")
    @Size(max = 5)
    private String unLocationCode;

    @Column(name = "un_location_name")
    @Size(max = 100)
    private String unLocationName;

    @Column(name = "location_code")
    @Size(max = 3)
    private String locationCode;

    @Column(name = "country_code")
    @Size(max = 2)
    private String countryCode;
}
