package org.dcsa.testdata.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@Table(name = "location")
@Entity
public class Location {
    @Id
    @Column(name = "id")
    private UUID locationID;

    @Size(max = 100)
    @Column(name = "location_name")
    private String locationName;

    @Column(name = "address_id")
    private UUID addressId;

    @Size(max = 10)
    @Column(name = "latitude")
    private String latitude;

    @Size(max = 11)
    @Column(name = "longitude")
    private String longitude;

    @Column(name = "un_location_code")
    private String unLocationCode;
}
