package com.cda.dao;

import com.cda.bean.Utilisateur;

import java.util.List;

public interface IUtilisateurDao {

    public void create(Utilisateur pUser);

    public void update(Utilisateur pUser);

    public void deleteById(Utilisateur pUser);

    public Utilisateur findById(int pId);

    public List<Utilisateur> selectAll();
}
