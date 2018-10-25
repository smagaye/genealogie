package com.smag.genealogie.repository;

import com.smag.genealogie.model.Personne;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
    public interface PersonneRepository extends Neo4jRepository<Personne, Long> {

        @Query("MATCH (personnes:Personne) RETURN personnes")
        Iterable<Personne> getAllPersonnes();

        @Query("MATCH (u:Personne)-[r:marier]->(m:Personne) RETURN u,r,m")
        Collection<Personne> getAllPersonnesMariees();

}
