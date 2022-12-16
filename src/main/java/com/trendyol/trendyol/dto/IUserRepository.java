package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
