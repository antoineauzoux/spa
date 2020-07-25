package com.cda.service.impl;

import com.cda.bean.Compte;
import com.cda.dao.ICompteDao;
import com.cda.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteServiceImp implements ICompteService {

    @Autowired
    ICompteDao iCompteDao;

    @Override
    public void update(Compte pCompte) {

    }

    @Override
    public void deleteById(Compte pCompte) {

    }

    @Override
    public Compte findByCompte(Compte pCompte) {
        return iCompteDao.findByCompte(pCompte);
    }

    @Override
    public List<Compte> selectAll() {
        return null;
    }
}
