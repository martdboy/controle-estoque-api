package com.marttheguy.controle_estoque.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marttheguy.controle_estoque.entity.Produto;
import com.marttheguy.controle_estoque.service.ProdutoService;

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
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarProduto(@PathVariable Long id) {
		
		Optional<Produto> produtoOpcional = service.getProdutoById(id);
		if(!produtoOpcional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Produto produtoEncontrado = produtoOpcional.get();
		
		return ResponseEntity.ok().body(produtoEncontrado);
	}
	
	@PostMapping("/")
	public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
		Produto novoProduto = service.saveProduto(produto);
		return ResponseEntity.ok().body(novoProduto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
		
		Optional<Produto> produtoOpcional = service.getProdutoById(id);
		if(!produtoOpcional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		service.removeProdutoById(id);
		
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
		
		Optional<Produto> produtoOpcional = service.getProdutoById(id);
		if(!produtoOpcional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Produto produtoExiste = produtoOpcional.get();
		produtoExiste.setNome(produto.getNome());
		produtoExiste.setDescricao(produto.getDescricao());
		produtoExiste.setPreco(produto.getPreco());
		produtoExiste.setQuantidade(produto.getQuantidade());
		produtoExiste.setDisponivel(produto.isDisponivel());
		
		Produto produtoAtualizado = service.saveProduto(produtoExiste);
		
		return ResponseEntity.ok().body(produtoAtualizado);
		
	}
}
