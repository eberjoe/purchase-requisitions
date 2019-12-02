package com.neogrid.prequisition.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "PurchaseRequisitions")
public class PurchaseRequisition {

	@Id
	private String _id;
	private Long numero;
	private Long quantidade;
	private Double valor;
	private String item;

	public String get_id(ObjectId _id) {
		return _id.toHexString();
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id.toHexString();
	}
	
}
