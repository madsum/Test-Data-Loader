package org.dcsa.testdata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.dcsa.testdata.model.enums.DocumentReferenceType;


@Data
public class DocumentReferenceTO {
    public DocumentReferenceTO(DocumentReferenceType documentReferenceType, String documentReferenceValue){

        this.documentReferenceType = documentReferenceType;
        this.documentReferenceValue = documentReferenceValue;
    }

    public DocumentReferenceTO(){

    }
    @JsonProperty("documentReferenceType")
    private  DocumentReferenceType documentReferenceType;
    @JsonProperty("documentReferenceValue")
    private  String documentReferenceValue;
}
