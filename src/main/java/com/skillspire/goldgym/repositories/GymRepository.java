package com.skillspire.goldgym.repositories;

import com.skillspire.goldgym.dtos.GymDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<GymDto, Long> {
}
