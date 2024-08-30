package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Admin;
import com.example.LibraryManagementSystem.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}
