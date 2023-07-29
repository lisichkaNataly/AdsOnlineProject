package ru.skypro.homework.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.entity.User;
import ru.skypro.homework.mapper.UserMapper;
import ru.skypro.homework.repository.UserRepository;
import ru.skypro.homework.service.ImageService;
import ru.skypro.homework.service.UserService;

@Transactional
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ImageService imageService;
    private final PasswordEncoder encoder;

    @Override
    public User getUser(Authentication authentication) {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public User updateUser(UserDto userDto, Authentication authentication) {
        return null;
    }

    @Override
    public void updatePassword(String newPassword, String currentPassword, Authentication authentication) {

    }

    @Override
    public String updateUserImage(MultipartFile image, Authentication authentication) {
        return null;
    }

    @Override
    public User updateRole(long id, Role role) {
        return null;
    }
}
