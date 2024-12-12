package com.skillspire.goldgym.services.impl;

import com.skillspire.goldgym.dtos.GymDto;
import com.skillspire.goldgym.mappers.GymMapper;
import com.skillspire.goldgym.mappers.UserMapper;
import com.skillspire.goldgym.models.Gym;
import com.skillspire.goldgym.repositories.GymRepository;
import com.skillspire.goldgym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GymServiceImpl implements GymService {
    @Autowired
    private GymRepository gymRepository;

    @Autowired
    private GymMapper gymMapper;

    public GymDto createGym(Gym gym1) {
        GymDto gymDto = new GymDto();
        gymDto.setAddress(gym1.getAddress());
        gymDto.setManagerName(gym1.getManagerName());
        gymRepository.save(gymDto);
        return gymMapper.convertToGymDto(gym1);
    }

    public GymDto updateGym(Long id, Gym gym) {
        GymDto gymDto1 = gymRepository.findById(id).orElseThrow();
        gymDto1.setAddress(gym.getAddress());
        gymDto1.setManagerName(gym.getManagerName());
        gymRepository.save(gymDto1);
        return gymMapper.convertToGymDto(gym);
    }

    public GymDto getGymById(Long id) {
        GymDto gym = gymRepository.findById(id).orElseThrow();
        return gym;
    }

    public List<GymDto> getAllGyms() {
        List<GymDto> gyms = gymRepository.findAll();
        return gyms;
    }

    public void deleteGym(Long id) {
        gymRepository.deleteById(id);
    }
}
