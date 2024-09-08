package io.github.jotamath.btgpactual.orderms.repository;

import io.github.jotamath.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long>{
}
