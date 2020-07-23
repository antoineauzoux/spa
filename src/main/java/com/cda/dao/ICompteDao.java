package com.cda.dao;

import com.cda.bean.Compte;

import java.util.List;

public interface ICompteDao {
    void create(Compte pCompte);

    void update(Compte pCompte);

    void deleteById(Compte pCompte);

    Compte findByCompte(Compte pCompte);

    List<Compte> selectAll();

    void deleteAll();
}
