package com.example.msingressrelations.dao.repository;

import com.example.msingressrelations.dao.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
