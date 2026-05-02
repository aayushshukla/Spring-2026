package com.infosys.jpademo1.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter @Setter @ToString @NoArgsConstructor
@Table(name = "my_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int orderId;
    private  String product;
    private double price;

    public Order(String product, double price) {
        this.product = product;
        this.price = price;
    }
}
