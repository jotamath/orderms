package io.github.jotamath.btgpactual.orderms.repository;

import io.github.jotamath.btgpactual.orderms.controller.dto.OrderResponse;
import io.github.jotamath.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long>{
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
