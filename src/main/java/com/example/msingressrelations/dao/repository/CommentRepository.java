package com.example.msingressrelations.dao.repository;

import com.example.msingressrelations.dao.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
}
