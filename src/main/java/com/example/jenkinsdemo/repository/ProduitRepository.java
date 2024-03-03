package com.example.jenkinsdemo.repository;

import com.example.jenkinsdemo.entity.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<ProduitEntity,Integer>
{
}
