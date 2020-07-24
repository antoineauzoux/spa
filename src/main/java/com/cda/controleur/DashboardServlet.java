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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends AbstractServletController {
    @Autowired
    IChienService chienService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Chien> listeChiens = (ArrayList<Chien>) chienService.selectAll();
        request.setAttribute("listeChiens", listeChiens);
        this.getServletContext().getRequestDispatcher("/WEB-INF/tableaudebord.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Chien> listeChiens = (ArrayList<Chien>) chienService.selectAll();
        request.setAttribute("listeChiens", listeChiens);
        this.getServletContext().getRequestDispatcher("/WEB-INF/tableaudebord.jsp").forward(request, response);

    }
}
