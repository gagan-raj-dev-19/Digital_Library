package com.example.Digital_Library.repository;

import com.example.Digital_Library.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    User findByUsername(String name);

}
