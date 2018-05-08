/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabeldata.servlet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author arrai
 */
@Entity
@Table(name = "NASABAH")
public class Nasabah {
    @Id
    @Column(name = "ID_NASABAH")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "NAMA")
    private String nama;
    
    @Column(name = "GENDER")
    private String gender;
    
    @Column(name = "NO_REGISTER")
    private Integer noRegister;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getNoRegister() {
        return noRegister;
    }

    public void setNoRegister(Integer noRegister) {
        this.noRegister = noRegister;
    }
    
    
}
