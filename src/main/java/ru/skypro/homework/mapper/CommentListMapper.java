package ru.skypro.homework.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.skypro.homework.entity.Ads;

@Mapper(componentModel = "spring",
        uses = {CommentMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        imports = Ads.class)
public interface CommentListMapper {


}
