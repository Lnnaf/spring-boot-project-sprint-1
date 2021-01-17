package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String userName;
    private String encryptPw;
    @OneToMany(mappedBy = "account")
    private Set<Patient>patientList;
    @OneToMany(mappedBy = "account")
    private Set<Employee>employeeList;
    @OneToMany(mappedBy = "account")
    private Set<AccountRole>accountRoleList;
    @OneToMany(mappedBy = "account")
    private Set<ImportAndExport>importAndExportList;
}
