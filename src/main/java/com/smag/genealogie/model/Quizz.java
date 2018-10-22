package com.smag.genealogie.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Quizz {

    @GraphId
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String idQuizz;

    private String idImage;

    private String idTexte;

    private String niveauDifficulte;

    private String score;

    private String dateJeu;

    public String getIdQuizz() {
        return idQuizz;
    }

    public void setIdQuizz(String idQuizz) {
        this.idQuizz = idQuizz;
    }

    public String getIdImage() {
        return idImage;
    }

    public void setIdImage(String idImage) {
        this.idImage = idImage;
    }

    public String getIdTexte() {
        return idTexte;
    }

    public void setIdTexte(String idTexte) {
        this.idTexte = idTexte;
    }

    public String getNiveauDifficulte() {
        return niveauDifficulte;
    }

    public void setNiveauDifficulte(String niveauDifficulte) {
        this.niveauDifficulte = niveauDifficulte;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDateJeu() {
        return dateJeu;
    }

    public void setDateJeu(String dateJeu) {
        this.dateJeu = dateJeu;
    }
}
