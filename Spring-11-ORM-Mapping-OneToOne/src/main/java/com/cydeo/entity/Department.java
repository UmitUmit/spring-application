package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity{

    private String department;
    private String division;

    @OneToOne(mappedBy = "department") //bi-directional relationship, don't won it, but can access it both ways. But mapped by name should match the variable in Department class
    private Employee employee;


    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }


}
