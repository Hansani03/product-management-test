package com.example.product.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    private String product_name;
    private String category;
    private String brand;
    private double price;
    private int stock_quantity;
    private String supplier;
    private String country;
    private String status;

}
