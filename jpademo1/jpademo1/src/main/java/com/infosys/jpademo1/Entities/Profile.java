package com.infosys.jpademo1.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor

@ToString
public class Profile {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String phone;
    private String bio;

    public Profile(String phone, String bio) {
        this.phone = phone;
        this.bio = bio;
    }
}
