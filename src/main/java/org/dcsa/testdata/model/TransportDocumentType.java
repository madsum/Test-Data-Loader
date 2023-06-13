package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "transport_document_type")
public class TransportDocumentType {
    @Id
    @Size(max = 3 )
    @Column(name = "transport_document_type_code")
    private String transportDocumentTypeCode;

    @Column(name = "transport_document_type_name")
    @Size(max = 20)
    private String transportDocumentTypeName;

    @Column(name = "transport_document_type_description")
    @Size(max = 500)
    private String transportDocumentTypeDescription;
}
