package ru.skypro.homework.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import ru.skypro.homework.dto.AdsDto;
import ru.skypro.homework.dto.CreateAdsDto;
import ru.skypro.homework.entity.Ads;


@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AdsMapper {

    Ads toAds(CreateAdsDto createAdsDto);

    @Mapping(source = "author.id", target = "author")
    @Mapping(target = "image", expression = "java(\"/image/\" + ad.getImage().getId())")
    AdsDto toDto(Ads ad);

    void updateAds(CreateAdsDto createAdsDto, @MappingTarget Ads ad);


}
