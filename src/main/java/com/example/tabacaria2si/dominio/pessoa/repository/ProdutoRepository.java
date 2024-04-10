package com.example.tabacaria2si.dominio.pessoa.repository;

import com.example.tabacaria2si.dominio.pessoa.entity.Produto;
import com.example.tabacaria2si.dominio.pessoa.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
