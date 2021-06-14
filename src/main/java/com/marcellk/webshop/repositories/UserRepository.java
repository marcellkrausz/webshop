package com.marcellk.webshop.repositories;

import com.marcellk.webshop.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
