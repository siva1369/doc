package com.mediconnect.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientName;
    private String description;
    private LocalDate date;

    @ManyToOne
    private Doctor doctor;

    // Getters and Setters
}
