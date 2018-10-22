package com.smag.genealogie.resource;

import com.smag.genealogie.model.Personne;
import com.smag.genealogie.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@RepositoryRestController
public class PersonneRest {
    @Autowired
    PersonneService personneService;

    @RequestMapping("/personnes")
    public Collection<Personne> personnes(){
       // System.out.println("Size : "+personneService.getPersonnes().size());
        return  personneService.getPersonnes();
    }

}
