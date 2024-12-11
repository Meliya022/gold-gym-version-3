package com.skillspire.goldgym.services;

import com.skillspire.goldgym.dtos.UserDto;
import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(int id);
    List<UserDto> getAllUsers();
    UserDto updateUserById(int id, UserDto userDto);
    String deleteUserById(int id);
}