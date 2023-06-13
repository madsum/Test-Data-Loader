package org.dcsa.testdata.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.UUID;

@NoArgsConstructor
@Table(name = "facility")
@Entity
public class Facility {
    @Id
    @Column(name = "id")
    private UUID id;
    @Size(max = 100)
    @Column(name = "facility_name")
    private String facilityName;
    @Size(max = 5)
    @Column(name = "un_location_code")
    private String unLocationCode;
    @Size(max = 4)
    @Column(name = "facility_bic_code")
    private String facilityBICCode;
    @Size(max = 4)
    @Column(name = "facility_smdg_code")
    private String facilitySMDGCode;
    @Column(name = "location_id")
    private String locationID;

    public UUID getFacilityID() {
        return this.id;
    }

    public String getFacilityName() {
        return this.facilityName;
    }

    public String getUnLocationCode() {
        return this.unLocationCode;
    }

    public String getFacilityBICCode() {
        return this.facilityBICCode;
    }

    public String getFacilitySMDGCode() {
        return this.facilitySMDGCode;
    }

    public String getLocationID() {
        return this.locationID;
    }

    public void setFacilityID(final UUID facilityID) {
        this.id = facilityID;
    }

    public void setFacilityName(final String facilityName) {
        this.facilityName = facilityName;
    }

    public void setUnLocationCode(final String unLocationCode) {
        this.unLocationCode = unLocationCode;
    }

    public void setFacilityBICCode(final String facilityBICCode) {
        this.facilityBICCode = facilityBICCode;
    }

    public void setFacilitySMDGCode(final String facilitySMDGCode) {
        this.facilitySMDGCode = facilitySMDGCode;
    }

    public void setLocationID(final String locationID) {
        this.locationID = locationID;
    }


    public String toString() {
        return "Facility()";
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Facility)) {
            return false;
        } else {
            Facility other = (Facility)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                return super.equals(o);
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Facility;
    }

    public int hashCode() {
        int result = super.hashCode();
        return result;
    }
}
