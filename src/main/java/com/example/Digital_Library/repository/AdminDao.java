package com.example.Digital_Library.repository;

import com.example.Digital_Library.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin, Integer> {
}
