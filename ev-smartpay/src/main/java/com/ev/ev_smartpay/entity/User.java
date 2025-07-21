package com.ev.ev_smartpay.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity//JPA will considered it as entity class and maps to DB 
@Table(name = "users")//creates table name as "users" else it will be named as User(class name itself)
public class User {
    
    @Id//primary key-exactly one id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id's will be auto-incremented
    private Long id;

    private String name;

    private String email;
}
