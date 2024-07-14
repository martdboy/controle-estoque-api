package com.marttheguy.controle_estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marttheguy.controle_estoque.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
