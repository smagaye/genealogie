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

    public Collection<Personne> getPersonnes(){
       return personneRepository.getAllPersonnes();
    }
}
