package com.cda.dao;

import com.cda.bean.Utilisateur;

import java.util.List;

public interface IUtilisateurDao {

    void create(Utilisateur pUser);

    void update(Utilisateur pUser);

    void deleteById(Utilisateur pUser);

    Utilisateur findById(int pId);

    List<Utilisateur> selectAll();

    void deleteAll();
}
