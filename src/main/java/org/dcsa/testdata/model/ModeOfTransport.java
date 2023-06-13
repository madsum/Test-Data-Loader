package org.dcsa.testdata.model;

import lombok.Data;
import org.dcsa.testdata.model.enums.DCSATransportType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mode_of_transport")
public class ModeOfTransport {
    @Id
    @Column(name = "mode_of_transport_code")
    private String id;
    @Column(name = "mode_of_transport_name")
    private String name;
    @Column(name = "mode_of_transport_description")
    private String description;
    @Column(name = "dcsa_transport_type")
    private String dcsaTransportTypeStr;
    @Transient
    private DCSATransportType dcsaTransportType;

    public ModeOfTransport() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public DCSATransportType getDcsaTransportType() {
        return this.dcsaTransportType;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setDcsaTransportType(final DCSATransportType dcsaTransportType) {
        this.dcsaTransportType = dcsaTransportType;
        dcsaTransportTypeStr =  this.dcsaTransportType.toString();
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ModeOfTransport)) {
            return false;
        } else {
            ModeOfTransport other = (ModeOfTransport)o;
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

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                Object this$dcsaTransportType = this.getDcsaTransportType();
                Object other$dcsaTransportType = other.getDcsaTransportType();
                if (this$dcsaTransportType == null) {
                    if (other$dcsaTransportType != null) {
                        return false;
                    }
                } else if (!this$dcsaTransportType.equals(other$dcsaTransportType)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ModeOfTransport;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $dcsaTransportType = this.getDcsaTransportType();
        result = result * 59 + ($dcsaTransportType == null ? 43 : $dcsaTransportType.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = this.getId();
        return "ModeOfTransport(id=" + var10000 + ", name=" + this.getName() + ", description=" + this.getDescription() + ", dcsaTransportType=" + this.getDcsaTransportType() + ")";
    }
}

