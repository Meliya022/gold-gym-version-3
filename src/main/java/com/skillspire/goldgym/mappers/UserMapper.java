package com.skillspire.goldgym.mappers;

import com.skillspire.goldgym.dtos.UserDto;
import com.skillspire.goldgym.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setMailingStreetAddress(userDto.getMailingStreetAddress());
        user.setMailingCity(userDto.getMailingCity());
        user.setMailingState(userDto.getMailingState());
        return user;
    }
    public UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getMailingStreetAddress(),
                user.getMailingCity(),
                user.getMailingState()
        );
        return userDto;
    }
}
