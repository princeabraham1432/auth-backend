package com.example.auth.controller;

import com.example.auth.model.Role;
import com.example.auth.repository.RoleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // POST - create role
    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    // GET - all roles
    @GetMapping
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
