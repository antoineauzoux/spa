package com.cda.dao.impl;

import com.cda.bean.Chien;
import com.cda.dao.IChienDao;
import com.cda.dao.config.IDatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ChienDaoImp implements IChienDao {


    private Connection connection;

    @Autowired
    public ChienDaoImp( @Qualifier("connexionMysql") IDatabaseConnection databaseConnection) {

        this.connection = databaseConnection.getConnection();
    }

    @Override
    public List<Chien> selectAll() {
        List<Chien> chiens = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("select puceChien, nomChien, couleurChien, ageChien from chien");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Chien chien = new Chien();
                chien.setPuceChien(rs.getInt(1));
                chien.setNom(rs.getString(2));
                chien.setCouleur(rs.getString(3));
                chien.setAge(rs.getInt(4));
                chiens.add(chien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chiens;
    }

    @Override
    public void deleteById(Chien p) {
        String request = "delete from clients where id_client = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(request);
            ps.setInt(1, p.getPuceChien());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Chien findById(int id) {
        try {
            String request = "select * from clients where id_client = ?";
            PreparedStatement ps = connection.prepareStatement(request);
            ps.setInt(1, id );
            ResultSet r = ps.executeQuery();
            while (r.next()) {
                Integer vid = r.getInt(1);
                String nom = r.getString(2);
                String couleur = r.getString(3);
               int age = r.getInt(4);
                Chien  chien = new Chien();
                chien.setPuceChien(vid);
                chien.setNom(nom);
                chien.setCouleur(couleur);
                chien.setAge(age);
                return chien;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(Chien p) {
        try {
            String request = "INSERT INTO chien (puceChien, nomChien, couleurChien, ageChien ) VALUES (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(request);
            ps.setInt(1, p.getPuceChien());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getCouleur());
            ps.setInt(4, p.getAge());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Chien p) {
        try {
            PreparedStatement ps = connection.prepareStatement("update chien set nomChien = ?, couleurChien = ?, ageChien = ? where id = ?");
            ps.setString(1, p.getNom());
            ps.setString(2, p.getCouleur());
            ps.setInt(3, p.getAge());
            ps.setInt(4, p.getPuceChien());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
