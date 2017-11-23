package com.ipiecoles.java.javaeval.service;

import com.ipiecoles.java.javaeval.model.Employe;
import com.ipiecoles.java.javaeval.model.Entreprise;
import com.ipiecoles.java.javaeval.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EntrepriseService
{
    @Autowired
    EntrepriseRepository entrepriseRepository;

    //public Employe creerEntreprise(Entreprise e) { return entrepriseRepository.save(e);}

}
