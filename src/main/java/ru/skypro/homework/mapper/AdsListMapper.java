package ru.skypro.homework.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",
        uses = {AdsMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AdsListMapper {


}
