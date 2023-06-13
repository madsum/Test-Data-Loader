package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.dcsa.testdata.model.enums.EmptyIndicatorCode;
import org.dcsa.testdata.model.enums.EquipmentEventTypeCode;
import org.dcsa.testdata.model.enums.EventType;
import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;


@Data
@Table(schema = "event")
public class Event {

    @Size(max = 4)
    @Column(name = "equipment_event_type_code")
    private EquipmentEventTypeCode equipmentEventTypeCode;

    @Column(name = "event_type")
    private EventType eventType;

    @Size(max = 15)
    @Column(name = "equipment_reference")
    private String equipmentReference;

    @Size(max = 5)
    @Column(name = "empty_indicator_code")
    private EmptyIndicatorCode emptyIndicatorCode;

    @Size(max = 100)
    @Column(name = "transport_call_id")
    private UUID transportCallID;

    @Transient
    private TransportCall transportCall;

    @Transient
    private List<DocumentReferenceTO> documentReferences;

    @Transient
    private List<Reference> references;

    @Transient
    private List<Seal> seals;

    @Transient
    @JsonProperty("ISOEquipmentCode")
    private String isoEquipmentCode;

    @Transient
    @JsonProperty("eventTypeCode")
    private String eventTypeCode;


}

