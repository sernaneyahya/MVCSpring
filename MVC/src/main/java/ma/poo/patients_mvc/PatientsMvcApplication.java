package ma.poo.patients_mvc;

import ma.poo.patients_mvc.entities.Patient;
import ma.poo.patients_mvc.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication implements CommandLineRunner {
    @Autowired
    PatientRepo patientRepo;
    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        patientRepo.save(new Patient(null, "Youssef", new Date(), false, 210));

        patientRepo.findAll().forEach(patient -> {
            System.out.println(patient.getName());
        });
    }
}
