package com.example.Digital_Library.dto;

import com.example.Digital_Library.models.Author;
import com.example.Digital_Library.models.Genre;
import com.example.Digital_Library.models.Student;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class BookResponse {

    private Integer id;

    private String name;

    private Author book_author;

    private Student book_student;

    private Genre genre;

    private Integer price;

    private Date createdOn;

    private Date updatedOn;

}
