package com.cda.service;

import com.cda.bean.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

    void update(Utilisateur pUser);

    void deleteById(Utilisateur pUser);

    Utilisateur findByUser(Utilisateur pUser);

    List<Utilisateur> selectAll();

    void create(String nom, String prenom, String mail, String login, String password);

    Utilisateur findById(int pId);
}
