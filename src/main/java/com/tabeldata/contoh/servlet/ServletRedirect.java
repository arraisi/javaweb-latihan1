/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.contoh.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arrai
 */
//ANNOTATION
@WebServlet(name = "servletRedirect", urlPatterns = "/nasabah")
public class ServletRedirect extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //    super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        Integer noRegister = Integer.valueOf(req.getParameter("noRegister"));
        req.setAttribute("noRegister", noRegister);
        String nama = req.getParameter("nama");
        req.setAttribute("nama", nama);
        String gender = req.getParameter("gender");
        req.setAttribute("gender", gender);
        RequestDispatcher rd = req.getRequestDispatcher("/nasabah.jsp");
        rd.forward(req, resp);
    }
}
