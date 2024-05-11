package com.hackathon.ewallet.onboardingservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "merchant_details")
@Data
public class MerchantDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "business_type")
    private String businessType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;
}
