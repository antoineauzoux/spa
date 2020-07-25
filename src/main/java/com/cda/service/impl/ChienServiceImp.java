package com.cda.service.impl;

import com.cda.bean.Chien;
import com.cda.dao.IChienDao;
import com.cda.service.IChienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChienServiceImp implements IChienService {


    @Autowired
    IChienDao iChienDaoDao;

    @Override
    public List<Chien> selectAll() { return iChienDaoDao.selectAll();
    }

    @Override
    public void deleteById(Chien p) {
        iChienDaoDao.deleteById(p);
    }

    @Override
    public Chien findById(int id) {
        return iChienDaoDao.findById(id);
    }

    @Override
    public void create(Chien p) {
        iChienDaoDao.create(p);
    }

    @Override
    public void update(Chien p) {
        iChienDaoDao.update(p);
    }
}
