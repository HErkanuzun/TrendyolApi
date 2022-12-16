package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
