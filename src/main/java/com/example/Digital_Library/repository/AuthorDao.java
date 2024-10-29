package com.example.Digital_Library.repository;

import com.example.Digital_Library.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Integer> {

    Author findByEmail(String email);

}
