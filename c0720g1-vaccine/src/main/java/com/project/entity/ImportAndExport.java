package com.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "import_and_export")
public class ImportAndExport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String action;
    private Long quantity;
    private String date;
    private Long price;
    private Boolean deleteFlag;
    @ManyToOne
    @JoinColumn(name = "storage_id",nullable = false)
    private Storage storage;
    @ManyToOne
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;
}
