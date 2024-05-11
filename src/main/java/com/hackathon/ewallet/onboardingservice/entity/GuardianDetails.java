package com.hackathon.ewallet.onboardingservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "guardian_details")
@Data
public class GuardianDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name_of_guardian")
    private String nameOfGuardian;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_of_relation", referencedColumnName = "id")
    private GuardianType guardianType;




}
