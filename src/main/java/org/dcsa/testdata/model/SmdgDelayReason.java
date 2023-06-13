package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "smdg_delay_reason")
public class SmdgDelayReason {
    @Id
    @Column(name = "delay_reason_code")
    @Size(max = 3)
    private String delayReasonCode;

    @Size(max = 100)
    @Column(name = "delay_reason_name")
    private String delayReasonName;

    @Size(max = 250)
    @Column(name = "delay_reason_description")
    private String delayReasonDescription;
}
