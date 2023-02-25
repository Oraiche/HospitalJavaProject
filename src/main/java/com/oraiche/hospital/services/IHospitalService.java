package com.oraiche.hospital.services;

import com.oraiche.hospital.entities.Appointment;
import com.oraiche.hospital.entities.Consultation;
import com.oraiche.hospital.entities.Doctor;
import com.oraiche.hospital.entities.Patient;
import com.oraiche.hospital.repositories.PatientRepository;

import javax.print.Doc;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Doctor saveDoctor(Doctor doctor);
    Appointment saveAppointment(Appointment appointment);
    Consultation saveConsultation(Consultation consultation);
}
