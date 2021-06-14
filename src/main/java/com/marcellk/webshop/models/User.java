package com.marcellk.webshop.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;
    private String email;
    private int rang;
    private int cartId;

    public User(String name, String password, String email, int rang) {
        this.name = name;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
        this.email = email;
        this.rang = rang;
    }
}
