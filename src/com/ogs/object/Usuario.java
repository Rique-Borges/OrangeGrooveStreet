/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ogs.object;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author aluno
 */
public class Usuario {
    private int id;
    private String username;
    private String password;
    
    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try
        {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes(), 0, password.length());
            String senhaCriptografada = (new BigInteger(1,m.digest()).toString(16));
            this.password = senhaCriptografada;
        }
        catch(Exception e)
        {
        }
    }
}