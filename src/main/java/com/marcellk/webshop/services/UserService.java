package com.marcellk.webshop.services;

import com.marcellk.webshop.commands.UserCommand;
import com.marcellk.webshop.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User findById(Long id);

    User changeEmail(Long id, String email);

    User changeName(Long id, String name);

    void deleteById(Long id);

    UserCommand findUserCommandById(Long id);

    UserCommand saveUserCommand(UserCommand userCommand);

//    Cart getCartById(Long id);
}
