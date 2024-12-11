package com.skillspire.goldgym.repositories;

import com.skillspire.goldgym.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
