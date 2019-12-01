package com.neogrid.prequisition.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "PurchaseRequisitions")
public class PurchaseRequisition {

	@Id
	@Getter(AccessLevel.NONE) private ObjectId _id;
	private Long numero;
	private Long quantidade;
	private Double valor;
	private String item;
	
	public String get_id() {
		return _id.toHexString();
	}

}
