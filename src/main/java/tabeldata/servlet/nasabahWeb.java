package tabeldata.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tabeldata.servlet.config.KonfigurasiApps;
import tabeldata.servlet.dao.NasabahDao;
import tabeldata.servlet.model.Nasabah;

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
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(KonfigurasiApps.class);
        ctx.refresh();
        NasabahDao nasabahDao = ctx.getBean(NasabahDao.class);

        Nasabah nasabah = new Nasabah();
        nasabah.setNoRegister(noRegister);
        nasabah.setNama(nama);
        nasabah.setGender(gender);
        nasabahDao.simpanNasabah(nasabah);
    }

}
