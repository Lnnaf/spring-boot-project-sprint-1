package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vaccine_type")
public class VaccineType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vaccineTypeId;
    private String nameVaccineType;
    @OneToMany(mappedBy = "vaccinationType")
    private Set<Vaccination> vaccinationList;
}
