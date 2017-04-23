package com.example.julien.androcv.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Julien on 13/04/2017.
 */

public class Competence implements Serializable {
    private String nom;
    private String type;
    private float rating;
    private String source;

    public Competence(String nom, String type, float rating,String source) {
        this.nom = nom;
        this.type = type;
        this.rating = rating;
        this.source = source;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public float getRating() {
        return rating;
    }
    public String getSource(){ return source; }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public static ArrayList GenerateDefaultCompetences(){
        Competence[] competencesWeb = {
                new Competence("Angular 2", "Web", 3,"angular2_icon"),
                new Competence("Node Js", "Web", 3,"nodejs_icon"),
                new Competence("PHP", "Web", 4,"php_icon"),
                new Competence(".net", "Web", 4,"net_icon")
        };
        List<Competence> tmpList = Arrays.asList(competencesWeb);
        ArrayList<Competence> competencesWebList = new ArrayList<Competence>(tmpList);


        return competencesWebList;
    }

    public static ArrayList GenerateDefaultCompetencesSystem(){
        Competence[] competencesSytem = {
                new Competence("Windows 10", "System", 5,"windows_icon"),
                new Competence("CentOs", "System", 3,"linux_icon"),
                new Competence("Mac Os", "System", 3,"macos_icon"),
        };
        List<Competence> tmpList = Arrays.asList(competencesSytem);
        ArrayList<Competence> competencesSystemList = new ArrayList<Competence>(tmpList);


        return competencesSystemList;
    }
}