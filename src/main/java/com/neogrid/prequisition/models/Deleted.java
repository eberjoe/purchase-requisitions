package com.neogrid.prequisition.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Document(collection = "deletedInXml")
@JacksonXmlRootElement
public class Deleted {
	
	@Id
	private String id;
	private Long numero;
	private Long quantidade;
	private Double valor;
	private String item;
	
	public Deleted(String id, Long numero, Long quantidade, Double valor, String item) {
		super();
		this.id = id;
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
		this.item = item;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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