package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brand, Long> {
}
