package com.skillspire.goldgym.mappers;

import com.skillspire.goldgym.dtos.GymDto;
import com.skillspire.goldgym.models.Gym;
import org.springframework.stereotype.Component;

@Component
public class GymMapper {

    public GymDto convertToGymDto(Gym gym) {
        GymDto gymDto = new GymDto();
        gymDto.setId(gym.getId());
        gymDto.setAddress(gym.getAddress());
        gymDto.setManagerName(gym.getManagerName());
        return gymDto;
    }
}
