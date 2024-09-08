package io.github.jotamath.btgpactual.orderms.listener.dto;

import java.math.BigDecimal;

public record OrderItemEvent(String produto, Integer quantidade, BigDecimal preco) {
}
