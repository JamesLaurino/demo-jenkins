package com.example.jenkinsdemo.service;

import com.example.jenkinsdemo.entity.ProduitEntity;
import com.example.jenkinsdemo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService
{
    @Autowired
    private ProduitRepository produitRepository;

    public List<ProduitEntity> getALl()
    {
        return produitRepository.findAll();
    }
}
