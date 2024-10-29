package com.example.Digital_Library.service;

import com.example.Digital_Library.models.Student;
import com.example.Digital_Library.models.User;
import com.example.Digital_Library.repository.StudentCacheRepo;
import com.example.Digital_Library.repository.StudentDao;
import com.example.Digital_Library.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    @Autowired
    UserService userService;


    @Autowired
    StudentCacheRepo studentCacheRepo;

    public void createOrUpdate(Student student) throws Exception {
        User user = student.getUser();

        user = userService.save(Constants.STUDENT_USER, user);

        if(user.getId() == null) {
            throw new Exception("Invalid User");
            // TODO - handle exception
        }

        student.setUser(user);
        studentDao.save(student);
    }

    public Student findStudent(String searchKey, String searchValue) throws Exception {
        return switch(searchKey) {
            case "email" -> studentDao.findStudentByEmail(searchValue);
            case "rollNumber" -> studentDao.findStudentByRollNumber(searchValue);
            case "id" -> findById(Integer.parseInt(searchValue));

            default -> throw new Exception("Search key is not valid: " + searchKey);
        };
    }

    private Student findById(Integer studentId) {

        Student student = studentCacheRepo.getStudent(studentId);

        if(student != null) {
            return student;
        }

        student = studentDao.findById(studentId).orElse(new Student());
        if(student != null) {
            studentCacheRepo.setStudent(student);
        }

        return student;






    }


}
