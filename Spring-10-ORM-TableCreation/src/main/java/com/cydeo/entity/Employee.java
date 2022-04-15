package com.cydeo.entity;


import javax.persistence.*;

@Entity //springboot creates employee table in database for us(automatically)
//@Table(name = "Employee_Table") //users cannot used in here
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;




}
