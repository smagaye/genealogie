package com.smag.genealogie.service;

import com.smag.genealogie.model.Personne;
import com.smag.genealogie.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class PersonneService {

    @Autowired
    PersonneRepository personneRepository;

    public Collection<Personne> getAllPersonnesMariees(){
       return personneRepository.getAllPersonnesMariees();
    }

    public Iterable<Personne> getAllPersonnes(){
        return personneRepository.getAllPersonnes();
    }
}
