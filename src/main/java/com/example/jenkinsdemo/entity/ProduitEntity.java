package com.example.jenkinsdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor @NoArgsConstructor
@Data @Getter @Setter
public class ProduitEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}
