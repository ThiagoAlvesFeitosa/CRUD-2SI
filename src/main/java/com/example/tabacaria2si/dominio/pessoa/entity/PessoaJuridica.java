package com.example.tabacaria2si.dominio.pessoa.entity;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "TB_FORNECEDOR")
@DiscriminatorValue("PJ")

public class PessoaJuridica extends Pessoa{

    @Column(name = "NR_CNPJ")
    private String CNPJ;

    @Column(name = "NR_IE")
    private String inscricaoEstadual;


    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            joinColumns = {
                    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_PESSOA", foreignKey = @ForeignKey(name = "FK_PJ_EMPRESA"))
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "ID_SOCIO",
                            referencedColumnName = "ID_PESSOA",
                            foreignKey = @ForeignKey(name = "FK_SOCIO_PESSOA")
                    )
            }
    )
    private Set<Pessoa> socios = new LinkedHashSet<>();//trabalha bem com JPA nao permite duplicidade e elementos se conhecem




    public PessoaJuridica addSocio(Pessoa p){
        if (this.equals(p)) throw new RuntimeException("Nao e permitido me adicionar");
        socios.add(p);
        return this;
    }


    public PessoaJuridica remove(Pessoa p){
        socios.remove(p);
        return this;
    }

    public Set<Pessoa> getSocios() {
        return Collections.unmodifiableSet(socios);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public PessoaJuridica setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
        return this;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public PessoaJuridica setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }
}
