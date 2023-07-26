package com.example.msingressrelations.dao.repository;

import com.example.msingressrelations.dao.entity.UserDetailEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDetailRepository extends JpaRepository<UserDetailEntity,Long> {
    @Query(value = "SELECT U FROM UserDetailEntity u JOIN FETCH u.addresses WHERE u.name=:name")
    @EntityGraph(attributePaths = {"addresses"})
List<UserDetailEntity>findByNameContaining(String name);
}
