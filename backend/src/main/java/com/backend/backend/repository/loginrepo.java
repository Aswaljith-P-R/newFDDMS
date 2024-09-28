package com.backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.backend.model.login;

@Repository  // Marks this as a Spring Data repository
public interface loginrepo extends JpaRepository<login, Long> {
    // Inherits methods like save(), findById(), findAll() from JpaRepository
}
