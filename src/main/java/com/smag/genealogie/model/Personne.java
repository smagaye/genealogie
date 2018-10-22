package com.smag.genealogie.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.typeconversion.DateString;

import java.util.List;

@NodeEntity
public class Personne {

    @GraphId
    private Long id;

    private String idPersonne;

    private String prenom;

    private String nom;

    private String sexe;

    private Integer codeAccess;

    private String dateNaissance;

    private String lieuNaissance;

    private String paysNaissance;

    private String adresse;

    private String telephone;

    private String email;

    private String nomUtilisateur;

    @Relationship(type = "marier", direction = Relationship.INCOMING)
    private List<Personne> conjoints;

    @Relationship(type = "est_mere", direction = Relationship.INCOMING)
    private List<Personne> meres;

    @Relationship(type = "est_pere", direction = Relationship.INCOMING)
    private List<Personne> peres;

    public List<Personne> getPersonne() {
        return conjoints;
    }

    public void setPersonne(List<Personne> conjoints) {
        this.conjoints = conjoints;
    }

    public String getSexe() {
        return sexe;
    }

    public Integer getCodeAccess() {
        return codeAccess;
    }

    public List<Personne> getMeres() {
        return meres;
    }

    public void setMeres(List<Personne> meres) {
        this.meres = meres;
    }

    public List<Personne> getPeres() {
        return peres;
    }

    public void setPeres(List<Personne> peres) {
        this.peres = peres;
    }

    public String getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(String idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getPaysNaissance() {
        return paysNaissance;
    }

    public void setPaysNaissance(String paysNaissance) {
        this.paysNaissance = paysNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setCodeAccess(Integer codeAccess) {
        this.codeAccess = codeAccess;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    private String motPasse;
}
