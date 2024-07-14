package com.marttheguy.controle_estoque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="quantidade", nullable = false)
	private int quantidade;
	
	@Column(name="descricao", nullable = false)
	private String descricao;
	
	@Column(name="preco", nullable = false)
	private	Double preco;
	
	@Column(name="disponivel", nullable = false)
	private boolean disponivel;


	public Produto() {}
	
	public Produto(String nome, int quantidade, String descricao, Double preco, boolean disponivel) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.preco = preco;
		this.disponivel = disponivel;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
