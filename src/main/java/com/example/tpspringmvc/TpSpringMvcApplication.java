package com.example.tpspringmvc;

import com.example.tpspringmvc.entities.Patient;
import com.example.tpspringmvc.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TpSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            Patient p1 = new Patient();
            p1.setNom("KOUNDI");
            p1.setPrenom("WAIL");
            p1.setDateNaissance(new Date());
            p1.setMalade(false);
            p1.setScore(120);

            Patient p2 = new Patient(null, "HAKIMI", "ACHRAF", new Date(), false, 150);

            Patient p3 = Patient.builder()
                    .nom("ZIYACH")
                    .prenom("HAKIM")
                    .malade(false)
                    .score(190)
                    .build();
            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

            patientRepository.findAll().forEach(System.out::println);
        };
    }
}
