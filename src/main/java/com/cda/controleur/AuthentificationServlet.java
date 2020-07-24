package com.cda.controleur;

import com.cda.bean.Compte;
import com.cda.controleur.conf.AbstractServletController;
import com.cda.service.ICompteService;
import com.cda.service.IUtilisateurService;
import com.cda.util.PasswordHash;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends AbstractServletController {

    @Autowired
    ICompteService compteService;

    @Autowired
    IUtilisateurService utilisateurService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("identifiant");
        String password = request.getParameter("password");
        Compte compte = new Compte();
        compte.setLogin(login);
        compte.setPassword(PasswordHash.getMd5(password));
        Compte compteSession = compteService.findByCompte(compte);

        if(compteSession != null) {
            HttpSession session = request.getSession();
            session.setAttribute("nom", utilisateurService.findById(compteSession.getIdUtilisateur()).getNom());
            session.setAttribute("prenom", utilisateurService.findById(compteSession.getIdUtilisateur()).getPrenom());
            session.setAttribute("id", utilisateurService.findById(compteSession.getIdUtilisateur()).getId());
            this.getServletContext().getRequestDispatcher("/DashboardServlet").forward(request, response);
        }
    }
}