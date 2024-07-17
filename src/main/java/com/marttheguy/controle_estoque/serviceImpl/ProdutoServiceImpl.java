package com.marttheguy.controle_estoque.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marttheguy.controle_estoque.entity.Produto;
import com.marttheguy.controle_estoque.repository.ProdutoRepository;
import com.marttheguy.controle_estoque.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoRepository repository;
	
	/**
	 * Retorna uma lista com todos os produtos registrados no estoque
	 */
	@Override
	public List<Produto> getAllProdutos() {
		return repository.findAll();
	}

	/**
	 * Adiciona um produto novo
	 */
	@Override
	public Produto saveProduto(Produto produto) {
		return repository.save(produto);
	}

	/**
	 * Remove um produto pelo seu ID
	 */
	@Override
	public void removeProdutoById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Produto> getProdutoById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Produto getProdutoByName(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long produtoOcurrences() {
		Long occurrences = repository.count();
		return occurrences;
	}

}
