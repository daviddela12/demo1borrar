package com.example.demo1borrar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idCustomer;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nif;
}
