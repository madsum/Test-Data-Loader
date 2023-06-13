package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "reference_type")
public class ReferenceType {
    @Size(max = 3)
    @Id
    @Column(name = "reference_type_code")
    private String referenceTypeCode;

    @Size(max = 100)
    @Column(name = "reference_name")
    private String referenceName;

    @Size(max = 200)
    @Column(name = "reference_description")
    private String referenceDescription;
}
