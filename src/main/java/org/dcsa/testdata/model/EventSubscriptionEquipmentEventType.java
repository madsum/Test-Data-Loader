package org.dcsa.testdata.model;

import org.dcsa.testdata.model.enums.EquipmentEventTypeCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name = "event_subscription_equipment_event_type")
public class EventSubscriptionEquipmentEventType {
    @Id
    @Column(name = "subscription_id")
    private UUID subscriptionID;
    @Column(name = "equipment_event_type_code")
    private EquipmentEventTypeCode equipmentEventTypeCode;

    public EventSubscriptionEquipmentEventType() {
    }

    public UUID getSubscriptionID() {
        return this.subscriptionID;
    }

    public EquipmentEventTypeCode getEquipmentEventTypeCode() {
        return this.equipmentEventTypeCode;
    }

    public void setSubscriptionID(final UUID subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public void setEquipmentEventTypeCode(final EquipmentEventTypeCode equipmentEventTypeCode) {
        this.equipmentEventTypeCode = equipmentEventTypeCode;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof EventSubscriptionEquipmentEventType)) {
            return false;
        } else {
            EventSubscriptionEquipmentEventType other = (EventSubscriptionEquipmentEventType)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$subscriptionID = this.getSubscriptionID();
                Object other$subscriptionID = other.getSubscriptionID();
                if (this$subscriptionID == null) {
                    if (other$subscriptionID != null) {
                        return false;
                    }
                } else if (!this$subscriptionID.equals(other$subscriptionID)) {
                    return false;
                }

                Object this$equipmentEventTypeCode = this.getEquipmentEventTypeCode();
                Object other$equipmentEventTypeCode = other.getEquipmentEventTypeCode();
                if (this$equipmentEventTypeCode == null) {
                    if (other$equipmentEventTypeCode != null) {
                        return false;
                    }
                } else if (!this$equipmentEventTypeCode.equals(other$equipmentEventTypeCode)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof EventSubscriptionEquipmentEventType;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $subscriptionID = this.getSubscriptionID();
         result = result * 59 + ($subscriptionID == null ? 43 : $subscriptionID.hashCode());
        Object $equipmentEventTypeCode = this.getEquipmentEventTypeCode();
        result = result * 59 + ($equipmentEventTypeCode == null ? 43 : $equipmentEventTypeCode.hashCode());
        return result;
    }

    public String toString() {
        UUID var10000 = this.getSubscriptionID();
        return "EventSubscriptionEquipmentEventType(subscriptionID=" + var10000 + ", equipmentEventTypeCode=" + this.getEquipmentEventTypeCode() + ")";
    }
}

