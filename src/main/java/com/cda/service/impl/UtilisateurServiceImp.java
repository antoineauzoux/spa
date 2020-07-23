package com.cda.service.impl;

import com.cda.bean.Compte;
import com.cda.bean.Utilisateur;
import com.cda.dao.ICompteDao;
import com.cda.dao.IUtilisateurDao;
import com.cda.service.IUtilisateurService;
import com.cda.util.PasswordHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImp implements IUtilisateurService {

    @Autowired
    IUtilisateurDao utilisateurDao;

    @Autowired
    ICompteDao compteDao;

    @Override
    public void create(String pNom, String pPrenom, String pMail, String pLogin, String pPassword) {
        Utilisateur user = new Utilisateur(pNom, pPrenom, pMail);
        utilisateurDao.create(user);
        Compte compte = new Compte();
        compte.setPassword(PasswordHash.getMd5(pPassword));
        compte.setLogin(pLogin);
        compte.setIdUtilisateur(utilisateurDao.findByUser(user).getId());
        compteDao.create(compte);
    }

    @Override
    public void update(Utilisateur pUser) {
        utilisateurDao.update(pUser);
    }

    @Override
    public void deleteById(Utilisateur pUser) { utilisateurDao.deleteById(pUser); }

    @Override
    public Utilisateur findByUser(Utilisateur pUser) { return utilisateurDao.findByUser(pUser); }

    @Override
    public Utilisateur findById(int pId) {
        return utilisateurDao.findById(pId);
    }

    @Override
    public List<Utilisateur> selectAll() {
        return utilisateurDao.selectAll();
    }
}
