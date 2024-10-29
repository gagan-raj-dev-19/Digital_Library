package com.example.Digital_Library.dto;

import com.example.Digital_Library.models.Student;
import com.example.Digital_Library.models.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateStudentRequest {


    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String rollNumber;
    @NotNull
    private Integer age;
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public Student to() {
        return Student.builder()
                .name(this.name)
                .age(this.age)
                .email(this.email)
                .rollNumber(this.rollNumber)
                .user(User.builder()
                        .username(this.username)
                        .password(this.password)
                        .build())
                .build();
    }


}
