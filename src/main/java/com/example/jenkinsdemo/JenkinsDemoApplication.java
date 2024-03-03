package com.example.jenkinsdemo;

import com.example.jenkinsdemo.entity.ProduitEntity;
import com.example.jenkinsdemo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication implements CommandLineRunner
{
    @Autowired
    private ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ProduitEntity produitEntity = ProduitEntity.builder()
                .name("Pomme")
                .build();
        produitRepository.save(produitEntity);

        System.out.println(produitRepository.findById(1));

        ProduitEntity produitEntity1 = ProduitEntity.builder()
                .name("Peche")
                .build();

        produitRepository.save(produitEntity1);
    }
}
