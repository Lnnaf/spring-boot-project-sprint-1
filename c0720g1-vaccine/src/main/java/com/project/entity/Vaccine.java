package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "vaccine")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vaccineId;
    private String name;
    private String licenseCode;
    private String origin;
    private String age;
    private String maintenance;
    private Double dosage;
    private Boolean deleteFlag;

    @OneToMany(mappedBy = "vaccine")
    private Set<Invoice> invoiceList;
    @ManyToOne
    @JoinColumn(name = "vaccine_type_id",nullable = false)
    private VaccineType vaccineType;
    @OneToMany(mappedBy = "vaccine")
    private Set<Vaccination> vaccinationList;
    @OneToMany(mappedBy = "vaccine")
    private Set<Storage> storageList;
}
