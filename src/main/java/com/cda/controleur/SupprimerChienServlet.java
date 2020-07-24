package com.cda.controleur;

import com.cda.bean.Chien;
import com.cda.controleur.conf.AbstractServletController;
import com.cda.service.IChienService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SupprimerChienServlet")
public class SupprimerChienServlet extends AbstractServletController {

    @Autowired
    IChienService chienService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Chien chien = new Chien();
        int numeroPuce = Integer.parseInt(request.getParameter("idChien"));
        System.out.println(numeroPuce);

        chien.setPuceChien(numeroPuce);
        chienService.deleteById(chien);



        this.getServletContext().getRequestDispatcher("/DashboardServlet").forward(request, response);


    }
}
