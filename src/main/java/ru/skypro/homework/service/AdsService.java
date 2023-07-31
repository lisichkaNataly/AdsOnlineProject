package ru.skypro.homework.service;

import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsCommentDto;
import ru.skypro.homework.dto.CreateAdsDto;
import ru.skypro.homework.entity.Ads;
import ru.skypro.homework.entity.AdsComment;

import java.util.Collection;


public interface AdsService {
    Collection<Ads> getAllAds();
    Collection<Ads> getAdsMe(Authentication authentication);
    Ads getAdsById(Long adId);
    Ads addAds(CreateAdsDto createAdsDto, MultipartFile imageFiles, Authentication authentication);
    Ads removeAdsById(Long adId, Authentication authentication);
    AdsComment getAdsComment(long adPk, long id);
    Collection<AdsComment> getComments(long adPk);
    AdsComment addAdsComments(long adPk, AdsCommentDto adsCommentDto, Authentication authentication);
    AdsComment deleteAdsComment(long adPk, long id, Authentication authentication);
    Ads updateAds(Long adId, CreateAdsDto createAdsDto, Authentication authentication);
    AdsComment updateComments(long adPk, long id, AdsComment adsComment, Authentication authentication);
    void updateAdsImage(long id, MultipartFile image, Authentication authentication);
}

