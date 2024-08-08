package org.example.groceryadminbackend.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int private_id;
    private int public_id;
    private String name;
    private String description;
    private String manufacturer;
    private BigDecimal value;
}
