package com.cojs.backend.usersapp.backend_usersapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.cojs.backend.usersapp.backend_usersapp.models.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    

}
