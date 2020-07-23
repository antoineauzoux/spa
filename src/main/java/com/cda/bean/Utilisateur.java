package com.cda.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;

    public Utilisateur(String pNom, String pPrenom, String pEmail) {
        this.nom = pNom;
        this.prenom = pPrenom;
        this.email = pEmail;
    }
}