package com.marttheguy.controle_estoque.service;

import java.util.List;
import java.util.Optional;

import com.marttheguy.controle_estoque.entity.Produto;

public interface ProdutoService {
	
	List<Produto> getAllProdutos();
	
	Optional<Produto> getProdutoById(Long id);
	
	Produto getProdutoByName(String nome);
	
	Produto saveProduto(Produto produto);
	
	void removeProdutoById(Long id);
			
	Long produtoOcurrences();
		
}
