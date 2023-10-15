package com.example.Employee1to1_mapping.service;


import com.example.Employee1to1_mapping.entity.Employee;
import com.example.Employee1to1_mapping.repo.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmpoService {


    @Autowired
    IEmployee iEmployee;
    public String addAllEmployee(List<Employee> newEmployee) {
        iEmployee.saveAll(newEmployee);
        return "employee added";
    }

    public List<Employee> getAllEmployee() {
        return iEmployee.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return iEmployee.findById(id);
    }

    public String updateEmployeeById(Long id, String fName) {
        Employee employee=iEmployee.findById(id).orElseThrow(null);
        if(employee != null){
            employee.setEmpoFirstName(fName);
            iEmployee.save(employee);
            return "updated";
        }
        else{
            return "invalid id";
        }
    }

    public String deleteEmployee(Long id) {
        iEmployee.deleteById(id);
        return "deleted";
    }
}
