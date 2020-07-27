package com.cda.controleur;

import com.cda.bean.Chien;
import com.cda.controleur.conf.AbstractServletController;
import com.cda.service.IChienService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateChienServlet")
public class UpdateChienServlet extends AbstractServletController {

    @Autowired
    IChienService iChienService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Chien chien = new Chien();
        chien.setNom(request.getParameter("nomChienUpdate"));
        chien.setAge(Integer.parseInt(request.getParameter("ageChienUpdate")));
        chien.setCouleur(request.getParameter("couleurChienUpdate"));
        chien.setPuceChien(Integer.parseInt(request.getParameter("idChienUpdate")));
        iChienService.update(chien);
        this.getServletContext().getRequestDispatcher("/DashboardServlet").forward(request, response);
    }
}
