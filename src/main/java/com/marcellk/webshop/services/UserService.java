package com.marcellk.webshop.services;

import com.marcellk.webshop.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User findById(Long id);

    User changeEmail(Long id, String email);

    User changeName(Long id, String name);

    void delete(Long id);

//    Cart getCartById(Long id);
}
