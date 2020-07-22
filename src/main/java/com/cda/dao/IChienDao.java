package com.cda.dao;

import com.cda.bean.Chien;

import java.util.List;

public interface IChienDao {
    public List<Chien> selectAll();

    public void deleteById(Chien p);

    public Chien findById(int id);

    public void create(Chien p);

    public void update(Chien p);
}
