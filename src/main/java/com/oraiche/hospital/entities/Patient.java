package com.oraiche.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity  @Data
@NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id  @GeneratedValue(strategy= GenerationType.IDENTITY )
private Long id;
    @Temporal(TemporalType.DATE)
private String name;
private Date birthDay;
private boolean sick;
@OneToMany(mappedBy ="patient",fetch = FetchType.LAZY)
private Collection<Appointment> appointments;
}
