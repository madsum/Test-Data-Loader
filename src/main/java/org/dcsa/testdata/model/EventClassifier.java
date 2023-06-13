package org.dcsa.testdata.model;

import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "event_classifier")
public class EventClassifier {

    @Id
    @Size(max = 3)
    @Column(name = "event_classifier_code")
    private String eventClassifierCode;

    @Column(name = "event_classifier_name")
    @Size(max = 30)
    @NotNull
    private String eventClassifierName;

    @Column(name = "event_classifier_description")
    @Size(max = 250)
    @Nullable
    private String eventClassifierDescription;
}
