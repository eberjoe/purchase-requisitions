package com.neogrid.prequisition.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PurchaseRequisitions")
public class PurchaseRequisition {

	@Id
	private ObjectId _id;
	private Long numero;
	private Long quantidade;
	private Double valor;
	private String item;
	
	public PurchaseRequisition() {}
	
	public PurchaseRequisition(ObjectId _id, Long numero, Long quantidade, Double valor, String item) {
		this._id = _id;
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
		this.item = item;
	}
	
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
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
