package org.dcsa.testdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table(name = "carrier")
public class Carrier {
    @Id
    @Column(name = "id")
    private UUID id;
    @Size(max = 100)
    @Column(name = "carrier_name")
    private String carrierName;
    @Size(max = 3)
    @Column(name = "smdg_code")
    private String smdgCode;
    @Size(max = 4)
    @Column(name = "nmfta_code")
    private String nmftaCode;

    public UUID getId() {
        return this.id;
    }

    public String getCarrierName() {
        return this.carrierName;
    }

    public String getSmdgCode() {
        return this.smdgCode;
    }

    public String getNmftaCode() {
        return this.nmftaCode;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public void setCarrierName(final String carrierName) {
        this.carrierName = carrierName;
    }

    public void setSmdgCode(final String smdgCode) {
        this.smdgCode = smdgCode;
    }

    public void setNmftaCode(final String nmftaCode) {
        this.nmftaCode = nmftaCode;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Carrier)) {
            return false;
        } else {
            Carrier other = (Carrier)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label59;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label59;
                    }

                    return false;
                }

                Object this$carrierName = this.getCarrierName();
                Object other$carrierName = other.getCarrierName();
                if (this$carrierName == null) {
                    if (other$carrierName != null) {
                        return false;
                    }
                } else if (!this$carrierName.equals(other$carrierName)) {
                    return false;
                }

                Object this$smdgCode = this.getSmdgCode();
                Object other$smdgCode = other.getSmdgCode();
                if (this$smdgCode == null) {
                    if (other$smdgCode != null) {
                        return false;
                    }
                } else if (!this$smdgCode.equals(other$smdgCode)) {
                    return false;
                }

                Object this$nmftaCode = this.getNmftaCode();
                Object other$nmftaCode = other.getNmftaCode();
                if (this$nmftaCode == null) {
                    if (other$nmftaCode != null) {
                        return false;
                    }
                } else if (!this$nmftaCode.equals(other$nmftaCode)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Carrier;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $carrierName = this.getCarrierName();
        result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
        Object $smdgCode = this.getSmdgCode();
        result = result * 59 + ($smdgCode == null ? 43 : $smdgCode.hashCode());
        Object $nmftaCode = this.getNmftaCode();
        result = result * 59 + ($nmftaCode == null ? 43 : $nmftaCode.hashCode());
        return result;
    }

    public String toString() {
        UUID var10000 = this.getId();
        return "Carrier(id=" + var10000 + ", carrierName=" + this.getCarrierName() + ", smdgCode=" + this.getSmdgCode() + ", nmftaCode=" + this.getNmftaCode() + ")";
    }

    public Carrier() {
    }
}
