package com.oraiche.hospital.repositories;

import com.oraiche.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Patient findByName(String name);

}
