package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
public class Item extends  BaseEntity{


    private String name;
    private String code;


}
