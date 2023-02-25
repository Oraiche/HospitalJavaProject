package com.oraiche.hospital;

import com.oraiche.hospital.entities.*;
import com.oraiche.hospital.repositories.AppointmentRepository;
import com.oraiche.hospital.repositories.ConsultationRepository;
import com.oraiche.hospital.repositories.DoctorRepository;
import com.oraiche.hospital.repositories.PatientRepository;
import com.oraiche.hospital.services.HospitalServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication  {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

          @Bean
         CommandLineRunner star(HospitalServiceImpl hospitalService,PatientRepository patientRepository,
								DoctorRepository doctorRepository,
								AppointmentRepository appointmentRepository,
								ConsultationRepository consultationRepository)
		  {
			  return arg->{
				 Stream.of("Mohammed","Hassan","Imane")
						 .forEach(name->{
							 Patient patient=new Patient();
							 patient.setName(name);
							 patient.setSick(false);
							 patient.setBirthDay(new Date());
							 hospitalService.savePatient(patient);

						 });

				  Stream.of("Yasser","Sara","Najwa")
						  .forEach(name->{
							  Doctor doctor=new Doctor();
							  doctor.setName(name);
							  doctor.setEmail(name+"@gmail.com");
							  doctor.setSpeciality("Generaliste"+name);
							 hospitalService.saveDoctor(doctor);

						  });
                   Patient patient=patientRepository.findById(2L).orElse(null);
				  System.out.println("wiwwwwwwwww");
				   System.out.println(patient.getName());
				  Doctor doctor=doctorRepository.findBySpeciality("GeneralisteSara");
				  System.out.println(doctor.getName());

				  Appointment appointment =new Appointment();
				  appointment.setDate(new Date());
				  appointment.setStatus(StatuRDV.PENDING);
				  appointment.setPatient(patient);
				  appointment.setDoctor(doctor);
				 hospitalService.saveAppointment(appointment);

				  Consultation consultation=new Consultation();
				  consultation.setRapport("Bien");
				  consultation.setDateConsultation(new Date());
				  consultation.setAppointment(appointment);

				  hospitalService.saveConsultation(consultation);



			  };
		  }
}