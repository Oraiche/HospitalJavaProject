package com.oraiche.hospital.repositories;

import com.oraiche.hospital.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    Doctor findByName(String name);
    Doctor findBySpeciality(String speciality);

}
