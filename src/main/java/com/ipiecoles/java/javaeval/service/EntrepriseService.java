package com.ipiecoles.java.javaeval.service;

import com.ipiecoles.java.javaeval.model.Employe;
import com.ipiecoles.java.javaeval.model.Entreprise;
import com.ipiecoles.java.javaeval.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseService
{
    @Autowired
    private EntrepriseRepository entrepriseRepository;
    @Autowired
    private EmployeService employeService;

    @Autowired
    public void setEmployeService(EmployeService employeService)
    {
        this.employeService = employeService;
    }

    public Entreprise findById(Long id){
        return (Entreprise) entrepriseRepository.findOne(id);
    }


    public Entreprise creerEntreprise(Entreprise e) {
        return (Entreprise) entrepriseRepository.save(e);
    }

}
