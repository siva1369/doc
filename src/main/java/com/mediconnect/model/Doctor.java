package com.mediconnect.model;

import jakarta.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String hospital;
    private String specialization;
    private int experience;
    private int surgeries;
    private double successRate;

    // Getters and Setters
}
