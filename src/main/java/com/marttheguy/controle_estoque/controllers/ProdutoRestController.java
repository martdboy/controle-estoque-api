package com.marttheguy.controle_estoque.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marttheguy.controle_estoque.models.Produto;
import com.marttheguy.controle_estoque.services.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoRestController {
	
	@Autowired
	private ProdutoService service;

	@GetMapping("/")
	public ResponseEntity<List<Produto>> listarProdutos() {
		
		List<Produto> produtos = service.getAllProdutos();
		if (!produtos.isEmpty()) {
			return ResponseEntity.ok().body(produtos);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
		Produto novoProduto = service.saveProduto(produto);
		return ResponseEntity.ok().body(novoProduto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
		service.removeProdutoById(id);
		return ResponseEntity.noContent().build();
	}
}
