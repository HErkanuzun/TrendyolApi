package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageRepository extends JpaRepository<Image, Long> {
}
