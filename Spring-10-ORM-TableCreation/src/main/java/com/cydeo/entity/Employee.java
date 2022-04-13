package com.cydeo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table") //users cannot used in here
public class Employee {


    @Id
    private int id;

    private String name;




}
