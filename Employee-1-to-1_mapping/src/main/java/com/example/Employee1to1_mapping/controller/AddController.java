package com.example.Employee1to1_mapping.controller;

import com.example.Employee1to1_mapping.entity.Address;
import com.example.Employee1to1_mapping.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddController {

    @Autowired
    AddService addService;

    @PostMapping("addresses")
    public String addAddress(@RequestBody List<Address> newAddress){
        return addService.addAddress(newAddress);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddress(){
        return addService.getAllAddress();
    }
    @GetMapping("address/id/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addService.getAddressById(id);
    }
    @PutMapping("address/id/{id}/name/{name}")
    public String updateAddressById(@PathVariable Long id,@PathVariable String name){
        return addService.updateAddressById(id,name);
    }
    @DeleteMapping("address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addService.deleteAddressById(id);
    }
}
