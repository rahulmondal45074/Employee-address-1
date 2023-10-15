package com.example.Employee1to1_mapping.service;

import com.example.Employee1to1_mapping.entity.Address;
import com.example.Employee1to1_mapping.repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddService {

    @Autowired
    IAddress iAddress;

    public String addAddress(List<Address> newAddress) {
        iAddress.saveAll(newAddress);
        return "address added";
    }

    public List<Address> getAllAddress() {
        return iAddress.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return iAddress.findById(id);
    }

    public String updateAddressById(Long id, String name) {
        Address address=iAddress.findById(id).orElseThrow(null);
        if ( address != null){
            address.setAddCity(name);
            iAddress.save(address);
            return "updated";
        }
        else{
            return "invalid id ";
        }
    }

    public String deleteAddressById(Long id) {
        iAddress.deleteById(id);
        return "deleted";
    }
}
