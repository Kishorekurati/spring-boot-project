package com.practice.my_project.entity;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
