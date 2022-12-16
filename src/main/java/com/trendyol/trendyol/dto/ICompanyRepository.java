package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company,Long> {
}
