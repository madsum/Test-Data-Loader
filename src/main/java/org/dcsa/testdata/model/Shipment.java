package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Table(name = "shipment")
@Entity
public class Shipment {
  @Id
  @JsonProperty("shipmentID")
  @Column(name = "id")
  private UUID id;
  @Column(name = "booking_id")
  @JsonIgnore
  @NotNull(message = "BookingID is required.")
  private UUID bookingID;
  @Column(name = "carrier_id")
  @JsonIgnore
  @NotNull(message = "CarrierID is required.")
  private UUID carrierID;

  @NotNull(message = "CarrierBookingReference is required.")
  @Size(max = 35, message = "CarrierBookingReference has a max size of 35.")
  @Column(name = "carrier_booking_reference")
  private String carrierBookingReference;

  @Column(name = "terms_and_conditions")
  private String termsAndConditions;

  @Column(name = "confirmation_datetime")
  @NotNull(message = "ConfirmedDateTime is required.")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  @JsonProperty("shipmentCreatedDateTime")
  private OffsetDateTime confirmationDateTime;

  @Column(name = "valid_until")
  private OffsetDateTime validUntil;

  // updatedDateTime is metadata to avoid having to query shipment_event for updated dateTime.
  // This is not part of the official IM model. They are added in the sql only.

  @Column(name = "updated_date_time")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  @JsonProperty("shipmentUpdatedDateTime")
  protected OffsetDateTime updatedDateTime;
}
