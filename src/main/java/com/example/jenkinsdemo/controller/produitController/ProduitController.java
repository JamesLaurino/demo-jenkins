package com.example.jenkinsdemo.controller.produitController;

import com.example.jenkinsdemo.entity.ProduitEntity;
import com.example.jenkinsdemo.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitController
{
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<ProduitEntity> getAll()
    {
        return produitService.getALl();
    }

}
