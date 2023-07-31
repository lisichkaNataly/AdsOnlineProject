package ru.skypro.homework.service;

import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.entity.User;


public interface UserService {
    User getUser(Authentication authentication);
    User getUserById(long id);
    User updateUser(UserDto userDto, Authentication authentication);
    void updatePassword(String newPassword, String currentPassword, Authentication authentication);
    String updateUserImage(MultipartFile image, Authentication authentication);
    User updateRole(long id, Role role);
}