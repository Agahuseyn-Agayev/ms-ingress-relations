package com.example.msingressrelations.dao.repository;

import com.example.msingressrelations.dao.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity,Long> {
}
