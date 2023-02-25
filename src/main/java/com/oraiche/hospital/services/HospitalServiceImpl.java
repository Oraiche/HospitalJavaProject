package com.oraiche.hospital.services;

import com.oraiche.hospital.entities.Appointment;
import com.oraiche.hospital.entities.Consultation;
import com.oraiche.hospital.entities.Doctor;
import com.oraiche.hospital.entities.Patient;
import com.oraiche.hospital.repositories.AppointmentRepository;
import com.oraiche.hospital.repositories.ConsultationRepository;
import com.oraiche.hospital.repositories.DoctorRepository;
import com.oraiche.hospital.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private ConsultationRepository consultationRepository;


    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        appointment.setId(UUID.randomUUID().toString());
        return appointmentRepository.save(appointment);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
