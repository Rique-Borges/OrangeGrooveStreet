/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ogs.object;

/**
 *
 * @author aluno
 */
public class Funcionario {
    private int rf;
    private String nome;
    private String cargo;
    private String cpf;
    private int stat;

    public Funcionario() {
    }

    public String toString() {
        return this.nome;
    }

    public int getRf() {
        return rf;
    }

    public void setRf(int rf) {
        this.rf = rf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }
}
