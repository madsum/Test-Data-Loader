package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.dcsa.testdata.model.base.AbstractTransportCall;
import org.dcsa.testdata.model.enums.DCSATransportType;
import org.dcsa.testdata.model.enums.FacilityCodeListProvider;
import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import javax.validation.constraints.Size;

@Data
public class TransportCall extends AbstractTransportCall {

    @Size(max = 5)
    @Transient
    @JsonProperty("UNLocationCode")
    private String UNLocationCode;

    @JsonProperty("location")
    @Column(name = "location_id")
    private String locationID;

    @Column(name = "mode_of_transport_code")
    @JsonProperty("modeOfTransport")
    private DCSATransportType modeOfTransport;

    @Transient
    @JsonProperty("carrierServiceCode")
    private String carrierServiceCode;

    @Transient
    @JsonProperty("carrierVoyageNumber")
    private String carrierVoyageNumber;

    @Transient
    @JsonProperty("facilityCodeListProvider")
    private FacilityCodeListProvider facilityCodeListProvider;

    @Transient
    private Vessel vessel;
}
