package com.example.Digital_Library.service;

import com.example.Digital_Library.models.Admin;
import com.example.Digital_Library.models.User;
import com.example.Digital_Library.repository.AdminDao;
import com.example.Digital_Library.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminDao adminDao;

    @Autowired
    UserService userService;

    public void createAdmin(Admin admin) throws Exception {



        User user = admin.getUser();
        user = userService.save(Constants.ADMIN_USER, user);

        if(user.getId() == null) {
            throw new Exception("Invalid User");

        }

        admin.setUser(user);


        adminDao.save(admin);
    }

    public Admin findAdmin(Integer adminId) {
        return adminDao.findById(adminId).orElse(null);
    }



}
