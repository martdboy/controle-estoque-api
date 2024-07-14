package com.marttheguy.controle_estoque.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marttheguy.controle_estoque.models.Produto;
import com.marttheguy.controle_estoque.repository.ProdutoRepository;
import com.marttheguy.controle_estoque.services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public List<Produto> getAllProdutos() {
		return repository.findAll();
	}

	@Override
	public Produto saveProduto(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public void removeProdutoById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Produto updateProduto(Produto produto) {
		return null;
	}

	@Override
	public boolean checkIfProdutoExists() {
		// TODO Auto-generated method stub
		return false;		
	}

	@Override
	public Produto getProdutoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto getProdutoByName(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
