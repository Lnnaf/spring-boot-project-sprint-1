package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String name;
    private String dateOfBirth;
    private String idCard;
    private String address;
    private String phone;
    private Boolean deleteFlag;
    @ManyToOne
    @JoinColumn(name = "position_id",nullable = false)
    private Position position;
    @ManyToOne
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;
}
