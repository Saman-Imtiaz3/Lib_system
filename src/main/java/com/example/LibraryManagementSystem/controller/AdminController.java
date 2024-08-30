package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.entity.Admin;
import com.example.LibraryManagementSystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/{username}")
    public Admin getAdminByUsername(@PathVariable String username) {
        return adminService.getAdminByUsername(username);
    }
}
