package com.hackathon.ewallet.onboardingservice.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private String age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserType userType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "merchant_id", referencedColumnName = "id")
    private MerchantDetails merchantDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guardian_id", referencedColumnName = "id")
    private MerchantDetails guardianDetails;







}
