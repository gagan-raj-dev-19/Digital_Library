package com.example.Digital_Library.repository;

import com.example.Digital_Library.models.Book;
import com.example.Digital_Library.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {


    List<Book> findByGenre(Genre genre);
    List<Book> findByName(String bookName);

    @Query("Select b from Book b, Author a where b.book_author.id = a.id and a.name = ?1")
    List<Book> findByAuthor_Name(String authorName);

}
