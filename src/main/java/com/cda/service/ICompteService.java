package com.cda.service;

import com.cda.bean.Compte;
import com.cda.bean.Utilisateur;

import java.util.List;

public interface ICompteService {

    void update(Compte pCompte);

    void deleteById(Compte pCompte);

    Compte findByCompte(Compte pCompte);

    List<Compte> selectAll();
}
