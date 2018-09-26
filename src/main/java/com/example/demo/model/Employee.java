package com.example.demo.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Table
@Entity
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String middleInitial;

    @Column
    @CreationTimestamp
    Date dateStarted;
}
