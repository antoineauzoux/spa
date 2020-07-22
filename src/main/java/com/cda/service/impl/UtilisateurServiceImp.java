package com.cda.service.impl;

import com.cda.bean.Utilisateur;
import com.cda.dao.IUtilisateurDao;
import com.cda.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImp implements IUtilisateurService {

    @Autowired
    IUtilisateurDao utilisateurDao;

    @Override
    public void create(Utilisateur pUser) {
        utilisateurDao.create(pUser);
    }

    @Override
    public void update(Utilisateur pUser) {
        utilisateurDao.update(pUser);
    }

    @Override
    public void deleteById(Utilisateur pUser) {
        utilisateurDao.deleteById(pUser);
    }

    @Override
    public Utilisateur findById(int pId) {
        return utilisateurDao.findById(pId);
    }

    @Override
    public List<Utilisateur> selectAll() {
        return utilisateurDao.selectAll();
    }
}
