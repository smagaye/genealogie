package com.smag.genealogie.resource;

import com.smag.genealogie.model.Personne;
import com.smag.genealogie.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RepositoryRestController
@RestController
public class PersonneRest {
    @Autowired
    PersonneService personneService;

    @RequestMapping("/personnes")
    public Iterable<Personne> personnes(){
       //System.out.println("Size : "+personneService.getAllPersonne());
        return  personneService.getAllPersonnesMariees();
    }

}
