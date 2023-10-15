package com.example.Employee1to1_mapping.repo;


import com.example.Employee1to1_mapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployee extends JpaRepository<Employee,Long> {
}
