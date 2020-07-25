package com.cda.controleur;

import com.cda.bean.Chien;
import com.cda.controleur.conf.AbstractServletController;
import com.cda.service.IChienService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@WebServlet("/AjoutChienServlet")
@MultipartConfig(
        fileSizeThreshold   = 1024 * 1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15) // 15 MB
public class AjoutChienServlet extends AbstractServletController {
    public static final String IMAGES_FOLDER = "assets/img";
    public String uploadPath;

    @Autowired
    IChienService iChienService;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void init() throws ServletException {
        uploadPath = getServletContext().getRealPath( IMAGES_FOLDER );
        File uploadDir = new File( uploadPath );
        if ( ! uploadDir.exists() ) uploadDir.mkdir();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Part part = request.getPart("imgChien") ;
            String fileName = getFileName( part );
            if(fileName.equals("")){
                fileName = "Default.jpg";
            }
            String fullPath = uploadPath + File.separator + fileName;
            part.write(fullPath);


        Chien chien = new Chien();
        chien.setImage(fileName);
        chien.setNom(request.getParameter("nomChien"));
        chien.setAge(Integer.parseInt(request.getParameter("ageChien")));
        chien.setCouleur(request.getParameter("couleurChien"));
        chien.setPuceChien(Integer.parseInt(request.getParameter("numeroPuce")));
        chien.setIdUtilisateur((Integer) request.getSession().getAttribute("id"));
            iChienService.create(chien);
       this.getServletContext().getRequestDispatcher("/DashboardServlet").forward(request, response);

    }

    private String getFileName( Part part ) {
        for ( String content : part.getHeader( "content-disposition" ).split( ";" ) ) {
            if ( content.trim().startsWith( "filename" ) )
                return content.substring( content.indexOf( "=" ) + 2, content.length() - 1 );
        }
        return "Default.jpg";
    }
}
