package com.example.tabacaria2si.dominio.pessoa.entity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double valor;
    private Integer quantidade;

    private Boolean disponivel;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double valor, Integer quantidade, Boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Double getValor() {
        return valor;
    }

    public Produto setValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Produto setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public Produto setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", disponivel=" + disponivel +
                '}';
    }
}
