package com.cda.bean;

import lombok.Data;


@Data
public class Utilisateur {

    private int id;
    private String nom;
    private String prenom;
    private String email;
}