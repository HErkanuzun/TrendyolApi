package com.trendyol.trendyol.dto;

import com.trendyol.trendyol.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepository extends JpaRepository<Comment,Long> {
}
