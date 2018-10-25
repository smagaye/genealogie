package com.smag.genealogie.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import java.util.List;

@NodeEntity
public class Enfants {

    @GraphId
    private Long id;
    private String idEnfant;

    @Relationship(type = "est_enfant", direction = Relationship.INCOMING)
    private List<Enfants> enfants;

    public String getIdEnfant() {
        return idEnfant;
    }

    public void setIdEnfant(String idEnfant) {
        this.idEnfant = idEnfant;
    }

    public List<Enfants> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Enfants> enfants) {
        this.enfants = enfants;
    }
}
