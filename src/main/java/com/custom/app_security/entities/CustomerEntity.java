package com.custom.app_security.entities;

import java.io.Serializable;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="customers")
@Data
public class CustomerEntity implements Serializable {
    @Id
    private BigInteger id;
    private String email;
    @Column(name="pwd")
    private String password;
    @Column(name="rol")
    private String role;

}
