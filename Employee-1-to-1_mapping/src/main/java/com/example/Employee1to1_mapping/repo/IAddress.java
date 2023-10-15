package com.example.Employee1to1_mapping.repo;

import com.example.Employee1to1_mapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address,Long> {
}
