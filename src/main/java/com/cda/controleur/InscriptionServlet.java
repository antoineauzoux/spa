package com.cda.controleur;

import com.cda.bean.Utilisateur;
import com.cda.controleur.conf.AbstractServletController;
import com.cda.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends AbstractServletController {

    @Autowired
    IUtilisateurService utilisateurService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String mail = request.getParameter("mail");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println(nom + prenom + mail + login + password);

        utilisateurService.create(nom, prenom, mail, login, password);
        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
    }
}
