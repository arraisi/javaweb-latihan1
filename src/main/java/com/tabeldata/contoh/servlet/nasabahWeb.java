package com.tabeldata.contoh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//SERVLET
public class nasabahWeb extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        Integer noRegister = Integer.valueOf(req.getParameter("noRegsiter"));
        String nama = req.getParameter("nama");
        String gender = req.getParameter("gender");

        resp.getWriter().append("<html>"
                + "<head>"
                + "<title>DATA NASABAH</title>"
                + "</head>"
                + "<body>No Register:" + noRegister + "<br/>"
                + "Nama Nasabah:" + nama + "<br/>"
                + "Jenis Kelamin:" + gender + "<br/>"
                + "</body>"
                + "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
//COBA REQUEST
        Integer noRegister = Integer.valueOf(req.getParameter("noRegister"));
        String nama = req.getParameter("nama");
        String gender = req.getParameter("gender");
//COBA RESPONES      
        resp.getWriter().append("<html>"
                + "<head>"
                + "<title>DATA NASABAH</title>"
                + "</head>"
                + "<body>No Register:" + noRegister + "<br/>"
                + "Nama Nasabah:" + nama + "<br/>"
                + "Jenis Kelamin:" + gender + "<br/>"
                + "</body>"
                + "</html>");
    }

}
