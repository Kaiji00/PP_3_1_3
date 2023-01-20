package ru.kata.spring.boot_security.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;
import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role getRoleById(Long id) {
        return roleRepository.getRoleById(id);
    }

    public Role getRoleByName(String name) {
        return roleRepository.getRoleByName(name);
    }

    @Transactional
    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    @Transactional
    public void addRole(Role role) {
        roleRepository.addRole(role);
    }

    public List<Role> getRoleListById(List<Long> rolesId) {
        return roleRepository.getRoleListById(rolesId);
    }
}
