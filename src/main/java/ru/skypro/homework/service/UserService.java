package ru.skypro.homework.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPasswordDto;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.entity.Image;
import ru.skypro.homework.entity.User;
import ru.skypro.homework.mapper.UserMapper;
import ru.skypro.homework.repository.UserRepository;

import java.io.IOException;

public interface UserService {
    User getUser(Authentication authentication);
    User getUserById(long id);
    User updateUser(UserDto userDto, Authentication authentication);
    void updatePassword(String newPassword, String currentPassword, Authentication authentication);
    String updateUserImage(MultipartFile image, Authentication authentication);
    User updateRole(long id, Role role);


}

