package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface UserRepository {

    public List<User> getAllUsers();

    User findByUserName(String username);

    void updateUser(User user);

    void deleteUserById(Long id);

    void saveUser(User user);

    User getUserById(Long id);

    User findUserByEmail(String email);
}