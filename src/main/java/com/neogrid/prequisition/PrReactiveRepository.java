package com.neogrid.prequisition;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PrReactiveRepository extends ReactiveMongoRepository<PurchaseRequisition, String> {

	Mono<PurchaseRequisition> findFirstById(Mono<Long> id);
	
}
