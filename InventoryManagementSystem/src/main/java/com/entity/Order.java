package com.inventory.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String product;
    private int quantity;
    private double totalPrice;
    private String status;
    private Date orderDate;

    // Getters and Setters
}
