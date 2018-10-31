package com.smag.genealogie.resource;

import com.smag.genealogie.model.Personne;
import com.smag.genealogie.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;


@RepositoryRestController
@RestController
@ResponseBody
public class PersonneRest {
    @Autowired
    PersonneService personneService;

    @RequestMapping("/personnes")
    public Iterable<Personne> personnes(){
        return  personneService.getAllPersonnes();
    }

    @RequestMapping(value="/personnes/{id}", method = RequestMethod.GET)
    public Personne getPersonne(@PathVariable("id")  String id){
        Personne personne=null;
        try {
            personne = personneService.getPersonneById(id);
        }catch (Exception ex){}

        return (personne==null? new Personne():personne);
    }

}
