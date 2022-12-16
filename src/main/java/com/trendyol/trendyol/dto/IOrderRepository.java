package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Long> {
}
