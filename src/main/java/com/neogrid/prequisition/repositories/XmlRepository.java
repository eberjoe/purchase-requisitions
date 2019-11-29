package com.neogrid.prequisition.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.neogrid.prequisition.models.DeletedInXml;

public interface XmlRepository extends MongoRepository<DeletedInXml, String> {

		DeletedInXml findById(ObjectId id);
		
}
