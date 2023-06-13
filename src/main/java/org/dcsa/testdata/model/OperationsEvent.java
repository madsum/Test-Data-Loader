package org.dcsa.testdata.model;

import lombok.Data;
import org.dcsa.testdata.model.base.Event;
import org.dcsa.testdata.model.enums.FacilityTypeCode;
import org.dcsa.testdata.model.enums.OperationsEventTypeCode;
import org.dcsa.testdata.model.enums.PartyFunction;
import org.dcsa.testdata.model.enums.PortCallServiceTypeCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.UUID;



@Data
@Entity
@Table(schema = "operations_event")
public class OperationsEvent extends Event {

    @Size(max = 4)
    @Column(name = "operations_event_type_code")
    private OperationsEventTypeCode operationsEventTypeCode;

    @Size(max = 100)
    @Column(name = "transport_call_id")
    private UUID transportCallID;

    @Size(max = 100)
    @Column(name = "publisher")
    private String publisherID;

    @Size(max = 3)
    @Column(name = "publisher_role")
    private PartyFunction publisherRole;

    @Size(max = 4)
    @Column(name = "port_call_service_type_code")
    private PortCallServiceTypeCode portCallServiceTypeCode;

    @Size(max = 100)
    @Column(name = "event_location")
    private String eventLocationID;

    @Size(max = 100)
    @Column(name = "facility_type_code")
    private FacilityTypeCode facilityTypeCode;

    @Size(max = 3)
    @Column(name = "delay_reason_code")
    private String delayReasonCode;

    @Size(max = 100)
    @Column(name = "vessel_position")
    private String vesselPositionID;

    @Size(max = 500)
    @Column(name = "remark")
    private String remark;
}