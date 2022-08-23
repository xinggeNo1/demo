package com.example.demo.entity;

import  javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Basic(optional = false)
    @Column(name = "name", nullable = true)
    private  String name;
    public String getName(){ return name;}
    public void  setName(String name){ this.name = name; }
    public Integer getId(){return id;}
    public void setId(Integer id){this.id = id;}
}
