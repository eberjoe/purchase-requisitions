package com.neogrid.prequisition.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.neogrid.prequisition.models.PurchaseRequisition;

public interface PurchaseRequisitionRepository extends MongoRepository<PurchaseRequisition, String> {
	
	PurchaseRequisition findBy_id(ObjectId _id);
	
	PurchaseRequisition findByNumero(Long numero);

}
