package com.marcellk.webshop.services;

import com.marcellk.webshop.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User changeEmail(Long id, String email) {
        return null;
    }

    @Override
    public User changeName(Long id, String name) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
