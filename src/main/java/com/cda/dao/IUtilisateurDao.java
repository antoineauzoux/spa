package com.cda.dao;

import com.cda.bean.Utilisateur;

import java.util.List;

public interface IUtilisateurDao {

    void create(Utilisateur pUser);

    void update(Utilisateur pUser);

    void deleteById(Utilisateur pUser);

    Utilisateur findByUser(Utilisateur pUser);

    List<Utilisateur> selectAll();

    void deleteAll();

    Utilisateur findById(int pId);
}
