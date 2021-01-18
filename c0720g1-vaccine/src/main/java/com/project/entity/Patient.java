package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String name;
    @Column(columnDefinition = "Date")
    private String dateOfBirth;
    private String gender;
    private String guardian;
    private String phone;
    private String address;
    private String email;
    private Boolean deleteFlag;

    @OneToMany(mappedBy = "patient")
    private Set<VaccinationHistory> vaccinationHistoryList;
    @OneToOne
    @JoinColumn(name = "account_id",nullable = false,unique = true)
    private Account account;
}
