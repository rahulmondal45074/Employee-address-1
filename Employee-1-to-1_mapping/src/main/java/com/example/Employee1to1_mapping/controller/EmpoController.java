package com.example.Employee1to1_mapping.controller;

import com.example.Employee1to1_mapping.entity.Employee;
import com.example.Employee1to1_mapping.service.EmpoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpoController {

    @Autowired
    EmpoService empoService;

    @PostMapping("employees")
    public String addAllEmployee(@RequestBody List<Employee> newEmployee){
        return empoService.addAllEmployee(newEmployee);
    }
    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        return empoService.getAllEmployee();
    }
    @GetMapping("employee/id/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return empoService.getEmployeeById(id);
    }
    @PutMapping("employee/id/{id}/fName/{fName}")
    public String updateEmployeeById(@PathVariable Long id,@PathVariable String fName){
        return empoService.updateEmployeeById(id,fName);
    }
    @DeleteMapping("employee")
    public String deleteEmployee(@PathVariable Long id){
        return empoService.deleteEmployee(id);
    }
}
