package com.example.msingressrelations.dao.repository;

import com.example.msingressrelations.dao.entity.UserDetailEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.springframework.data.jpa.repository.EntityGraph.EntityGraphType.FETCH;

public interface UserDetailRepository extends JpaRepository<UserDetailEntity, Long> {
    //    @Query(value = "SELECT u FROM UserDetailEntity u JOIN FETCH u.addresses WHERE u.name=:name")
//    @EntityGraph(type = FETCH,value = "user_details_entity_graph")
//    @EntityGraph(attributePaths = {"addresses"})
    List<UserDetailEntity> findByNameContaining(String name);
}
