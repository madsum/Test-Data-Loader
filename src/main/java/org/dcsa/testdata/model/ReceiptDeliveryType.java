package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "receipt_delivery_type")
public class ReceiptDeliveryType {
    @Size(max = 3)
    @Column(name = "receipt_delivery_type")
    @Id
    private String receiptDeliveryType;

    @Size(max = 300)
    @Column(name = "description")
    private String description;
}
