package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student Jimmy= new Student(

                    "Jimmy",

                    LocalDate.of(2002, Month.OCTOBER,28),
                    "jimmy.kharpatoe@gmail.com"
            );
            Student Alex= new Student(

                    "Alex",

                    LocalDate.of(2004, Month.OCTOBER,28),
                    "alex.kharpatoe@gmail.com"
            );

            repository.saveAll(List.of(Jimmy,Alex));

        };
    }
}
