package com.oraiche.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity
@Data  @AllArgsConstructor @NoArgsConstructor
public class Consultation {
    @Id   @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Date dateConsultation;
private String rapport;
@OneToOne
private Appointment appointment;
}
