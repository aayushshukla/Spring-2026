package com.infosys.jpademo1.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @ToString

public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int customerId;
    private  String customerName;
    private  String customerEmail;
//     one to one mapping
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id",unique = true)
    private  Profile profile;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id" ) // creates FK in orders table
    private List<Order> orders;

    public Customers(String customerName, String customerEmail, Profile profile) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.profile = profile;
    }

    public Customers(String customerName, String customerEmail, List<Order> orders) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.orders = orders;
    }
}
