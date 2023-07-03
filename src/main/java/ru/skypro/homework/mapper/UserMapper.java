package ru.skypro.homework.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ru.skypro.homework.dto.NewPasswordDto;
import ru.skypro.homework.dto.RegisterReqDto;
import ru.skypro.homework.dto.UserDto;
import ru.skypro.homework.entity.User;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {


    /**
     * Обновление полей пользователя firstName, lastName и phone данными из UserDto.
     */
    @Mapping(target = "user.image", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "email", ignore = true)
    void updateUser(UserDto userDto, @MappingTarget User user);

    /**
     * Обновление поля password в пользователе.
     */
    @Mapping(source = "newPasswordDto.newPassword", target = "password")
    void updateUserPassword(NewPasswordDto newPasswordDto, @MappingTarget User user);

    /**
     * Создание нового пользователя с данными из объекта RegisterReqDto при регистрации.
     */
    @Mapping(source = "username", target = "userName")
    @Mapping(source = "username", target = "email")
    User toUser(RegisterReqDto registerReqDto);

}