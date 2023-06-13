package org.dcsa.testdata.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "iso_equipment_code")
public class EquipmentCode {

    @Id
    @Column(name = "iso_equipment_code")
    @Size(max = 4)
    private String equipmentCode;

    @Column(name = "iso_equipment_name")
    @Size(max = 35)
    private String equipmentName;

    @Size(max = 2)
    @Column(name = "iso_equipment_size_code")
    private String equipmentSizeCode;

    @Size(max = 2)
    @Column(name = "iso_equipment_type_code_a")
    private String equipmentTypeCode;
}
