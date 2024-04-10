package com.example.tabacaria2si.dominio.pessoa.entity;

public class Admin extends Pessoa{

    private Boolean admin;

    public Admin() {
    }

    public Admin(Long id, String nome, Boolean admin) {
        super(id, nome);
        this.setAdmin(true);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin=" + getAdmin() +
                "} " + super.toString();
    }

    public Boolean getAdmin() {
        return admin;
    }

    public Admin setAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }
}
