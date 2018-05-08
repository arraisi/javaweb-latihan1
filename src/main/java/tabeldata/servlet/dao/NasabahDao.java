/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabeldata.servlet.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tabeldata.servlet.model.Nasabah;


@Repository
public class NasabahDao {

    @Autowired
    private SessionFactory sessionFactory;
//=====================================================================================================================


    @Transactional(readOnly = false)
    public void simpanNasabah(Nasabah nasabah) {
        sessionFactory.getCurrentSession().saveOrUpdate(nasabah);
    }
}
