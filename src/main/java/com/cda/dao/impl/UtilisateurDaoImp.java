package com.cda.dao.impl;

import com.cda.bean.Utilisateur;
import com.cda.dao.IUtilisateurDao;
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
public class UtilisateurDaoImp implements IUtilisateurDao {

    private Connection connection;

    @Autowired
    public UtilisateurDaoImp(@Qualifier("connexionMysql") IDatabaseConnection databaseConnection) {
        this.connection = databaseConnection.getConnection();
    }

    @Override
    public void create(Utilisateur pUser) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into utilisateur (nomUtilisateur, prenomUtilisateur, mailUtilisateur) values (?, ?, ?)");
            ps.setString(1, pUser.getNom());
            ps.setString(2, pUser.getPrenom());
            ps.setString(3, pUser.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Utilisateur pUser) {
        try {
            PreparedStatement ps = connection.prepareStatement("update utilisateur set nomUtilisateur = ?, prenomUtilisateur = ?, mailUtilisateur = ? where idUtilisateur = ?");
            ps.setString(1, pUser.getNom());
            ps.setString(2, pUser.getPrenom());
            ps.setString(3, pUser.getEmail());
            ps.setInt(4, pUser.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(Utilisateur pUser) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from utilisateur where idUtilisateur = ?");
            ps.setInt(1, pUser.getId());
            ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Utilisateur findById(int pId) {
        Utilisateur vUser = new Utilisateur();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "select idUtilisateur, nomUtilisateur, prenomUtilisateur, mailUtilisateur from utilisateur where idUtilisateur=" + pId );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vUser.setId(rs.getInt("idUtilisateur"));
                vUser.setNom(rs.getString("nomUtilisateur"));
                vUser.setPrenom(rs.getString("prenomUtilisateur"));
                vUser.setEmail(rs.getString("mailUtilisateur"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vUser;
    }

    @Override
    public List<Utilisateur> selectAll() {
        List<Utilisateur> usersList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from utilisateur");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Utilisateur user = new Utilisateur();
                user.setId(rs.getInt("idUtilisateur"));
                user.setNom(rs.getString("nomUtilisateur"));
                user.setPrenom(rs.getString("prenomUtilisateur"));
                user.setEmail(rs.getString("mailUtilisateur"));
                usersList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersList;
    }
}