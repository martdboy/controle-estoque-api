package com.marttheguy.controle_estoque.services;

import java.util.List;

import com.marttheguy.controle_estoque.models.Produto;

public interface ProdutoService {
	
	List<Produto> getAllProdutos();
	
	Produto saveProduto(Produto produto);
	
	void removeProdutoById(Long id);
	
	Produto updateProduto(Produto produto);
	
	boolean checkIfProdutoExists();
	
	Produto getProdutoById(Long id);
	
	Produto getProdutoByName(String nome);
	
}
