package com.example.msingressrelations.dao.repository;

import com.example.msingressrelations.dao.entity.AddressesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressesRepository extends JpaRepository<AddressesEntity,Long> {
}
