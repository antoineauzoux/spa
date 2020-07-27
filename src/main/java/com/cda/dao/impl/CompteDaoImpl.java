package com.cda.dao.impl;

import com.cda.bean.Compte;
import com.cda.dao.ICompteDao;
import com.cda.dao.config.IDatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CompteDaoImpl implements ICompteDao {

    private final Connection connection;

    @Autowired
    public CompteDaoImpl(@Qualifier("connexionMysql") IDatabaseConnection databaseConnection) {
        this.connection = databaseConnection.getConnection();
    }

    @Override
    public void create(Compte pCompte) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into compte (loginCompte, passwordCompte, idUtilisateur) values (?, ?, ?)");
            ps.setString(1, pCompte.getLogin());
            ps.setString(2, pCompte.getPassword());
            ps.setInt(3, pCompte.getIdUtilisateur());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Compte pCompte) {
        try {
            PreparedStatement ps = connection.prepareStatement("update compte set passwordCompte = ? where loginCompte = ?");
            ps.setString(1, pCompte.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(Compte pCompte) {
        try {
            PreparedStatement ps = connection.prepareStatement("delete from compte where idUtilisateur = ?");
            ps.setInt(1, pCompte.getIdUtilisateur());
            ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Compte findByCompte(Compte pCompte) {
        Compte vCompte = new Compte();
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "select * from compte where loginCompte = ? and passwordCompte = ?");
            ps.setString(1, pCompte.getLogin());
            ps.setString(2, pCompte.getPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vCompte.setLogin(rs.getString("loginCompte"));
                vCompte.setPassword(rs.getString("passwordCompte"));
                vCompte.setIdUtilisateur(rs.getInt("idUtilisateur"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vCompte;
    }

    @Override
    public List<Compte> selectAll() {
        List<Compte> comptesList = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from compte");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Compte vCompte = new Compte();
                vCompte.setLogin(rs.getString("loginCompte"));
                vCompte.setPassword(rs.getString("passwordCompte"));
                vCompte.setIdUtilisateur(rs.getInt("idUtilisateur"));
                comptesList.add(vCompte);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comptesList;
    }

    @Override
    public void deleteAll() {
        Statement s = null;
        try {
            s = connection.createStatement();
            s.execute("delete from compte");
            s.execute("alter table compte AUTO_INCREMENT = 0");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
