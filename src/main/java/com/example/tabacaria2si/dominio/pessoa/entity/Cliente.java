package com.example.tabacaria2si.dominio.pessoa.entity;

import java.util.Set;

public class Cliente extends Pessoa{

    private String contato;

    private String email;


    public Cliente() {
    }

    public Cliente(Long id, String nome, String contato, String email) {
        super(id, nome);
        this.contato = contato;
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public Cliente setContato(String contato) {
        this.contato = contato;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cliente setEmail(String email) {
        this.email = email;
        return this;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "contato='" + contato + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }
}
