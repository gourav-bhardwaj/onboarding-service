package com.hackathon.ewallet.onboardingservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "guardian_type")
@Data
public class GuardianType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="relation_type")
    private String relationType;

}
