package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
}
