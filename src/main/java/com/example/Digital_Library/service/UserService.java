package com.example.Digital_Library.service;

import com.example.Digital_Library.models.User;
import com.example.Digital_Library.repository.UserRepo;
import com.example.Digital_Library.utils.Constants;
import com.example.Digital_Library.utils.authoritiesListProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Configuration
public class UserService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }

    public User save(String userType, User user) {
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        String authorities = authoritiesListProvider.getAuthorities(userType);

        if(authorities.equals(Constants.INVALID_USER)) {
            return new User();
        }

        user.setPassword(encryptedPassword);
        user.setAuthorities(authorities);
        return userRepo.save(user);

    }


}
