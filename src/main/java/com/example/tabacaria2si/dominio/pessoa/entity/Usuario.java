package com.example.tabacaria2si.dominio.pessoa.entity;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_USUARIO")
@DiscriminatorValue("USER")
public class Usuario extends Pessoa{


    @Column(name = "NR_CPF")
    private String CPF;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name="TB_DEPENDENTES",
            joinColumns = {
                    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID_PESSOA", foreignKey = @ForeignKey(name = "FK_PE_DEPENDENTE"))
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ID_DEPENDENTE", referencedColumnName = "ID_PESSOA", foreignKey = @ForeignKey(name = "FK_DEPE_PESSOA"))
            }
    )
    private Set<Usuario> dependentes = new LinkedHashSet<>();

    private Boolean admin;


    public Usuario() {
    }

    public Usuario(Long id, String nome, String CPF, String email, Set<Usuario> dependentes, Boolean admin) {
        super(id, nome);
        this.CPF = CPF;
        this.email = email;
        this.dependentes = dependentes;
        this.admin = false;
    }

    public Usuario addDependente(Usuario p) {
        if (p.equals(this)) {
        throw  new RuntimeException("Nao posso ser me adicionar aqui.");
        }else{
            dependentes.add(p);
        }
        return this;
    }

    public Usuario removeDependente(Usuario p) {
        dependentes.remove(p);
        return this;
    }

    //tornar lista nao modificavel
    public Set<Usuario> getDependentes() {
        return Collections.unmodifiableSet(dependentes);
    }

    public String getCPF() {
        return CPF;
    }

    public Usuario setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                ", dependentes=" + dependentes +
                "} " + super.toString();
    }
}