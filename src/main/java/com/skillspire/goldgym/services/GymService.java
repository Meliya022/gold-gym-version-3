package com.skillspire.goldgym.services;

import com.skillspire.goldgym.dtos.GymDto;
import com.skillspire.goldgym.models.Gym;

import java.util.List;

public interface GymService {

    GymDto createGym(Gym gymDto);

    GymDto updateGym(Long id, Gym gymDto);

    GymDto getGymById(Long id);

    List<GymDto> getAllGyms();

    void deleteGym(Long id);
}
