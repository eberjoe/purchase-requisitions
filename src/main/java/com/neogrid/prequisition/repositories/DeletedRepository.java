package com.neogrid.prequisition.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.neogrid.prequisition.models.Deleted;

public interface DeletedRepository extends MongoRepository<Deleted, String> {

		Deleted findById(ObjectId id);
		
}
