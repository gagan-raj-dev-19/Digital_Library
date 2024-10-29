package com.example.Digital_Library.service;

import com.example.Digital_Library.models.Author;
import com.example.Digital_Library.repository.AuthorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorDao authorDao;

    public Author getOrCreate(Author author) {

        Author existingAuthor = authorDao.findByEmail(author.getEmail());

        if(existingAuthor == null) {
            existingAuthor = authorDao.save(author);
        }

        return existingAuthor;

    }



}
