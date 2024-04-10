package com.example.tabacaria2si.dominio.pessoa.repository;

import com.example.tabacaria2si.dominio.pessoa.entity.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
