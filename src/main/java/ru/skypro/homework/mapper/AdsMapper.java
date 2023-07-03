package ru.skypro.homework.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AdsMapper {


}
