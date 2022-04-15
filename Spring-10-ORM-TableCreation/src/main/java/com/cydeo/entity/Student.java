package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {
 //each below field means column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "studentFirstName", length = 100)
    private String firstName; //first_name
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
   @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
   @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

   @Enumerated(EnumType.STRING)// if put empty, it will show 0,1
   private Gender gender;



}
