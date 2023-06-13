package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.UUID;
@Data
@Entity
@Table(name = "transport")
public class Transport {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "transport_reference")
    @Size(max = 50)
    private String transportReference;

    @Column(name = "transport_name")
    @Size(max = 100)
    private String transportName;

    //@JsonIgnore
    @Column(name = "load_transport_call_id")
    private UUID loadTransportCallID;

    //@JsonIgnore
    @Column(name = "discharge_transport_call_id")
    private UUID dischargeTransportCallID;
}
