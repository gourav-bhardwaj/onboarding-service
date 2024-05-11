package com.hackathon.ewallet.onboardingservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_type")
@Data
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="user_type")
    private String userType;


}
