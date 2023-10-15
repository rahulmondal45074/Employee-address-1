package com.example.Employee1to1_mapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empoId;
    private String empoFirstName;
    private String empoLastName;
    private String empoAddress;

    @OneToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
}
