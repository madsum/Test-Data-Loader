package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "document_type")
public class DocumentType {
    @Id
    @Size(max = 3)
    @Column(name = "document_type_code")
    private String documentTypeCode;

    @Size(max = 100)
    @Column(name = "document_type_name")
    private String documentTypeName;
}
