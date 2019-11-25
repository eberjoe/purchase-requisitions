package com.neogrid.prequisition;

import javax.persistence.Id;

public class PurchaseRequisition {

	@Id
	private Long id;
	private Long numero;
	private Long quantidade;
	private Double valor;
	private String item;
	
	public PurchaseRequisition(Long id, Long numero, Long quantidade, Double valor, String item) {
		this.id = id;
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
		this.item = item;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
}
