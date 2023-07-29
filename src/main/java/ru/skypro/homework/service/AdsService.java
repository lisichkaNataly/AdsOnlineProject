package ru.skypro.homework.service;

import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.entity.Ads;
import ru.skypro.homework.entity.Comment;
import ru.skypro.homework.entity.Image;
import ru.skypro.homework.entity.User;
import ru.skypro.homework.mapper.AdsMapper;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.repository.AdsCommentRepository;

import java.io.IOException;
import java.util.Collection;


public interface AdsService {

    Collection<Ads> getAllAds();

    Collection<Ads> getAdsMe(Authentication authentication);
    Ads getAdsById(Long adId);

    Ads addAds(CreateAdsDto createAdsDto, MultipartFile imageFiles, Authentication authentication);

    Ads removeAdsById(Long adId, Authentication authentication);
    Comment getComment(long adPk, long id);
    Collection<Comment> getComments(long adPk);
    Comment addComments(long adPk, AdsCommentDto adsCommentDto, Authentication authentication);
    Comment deleteComment(long adPk, long id, Authentication authentication);
    Ads updateAds(Long adId, CreateAdsDto createAdsDto, Authentication authentication);
    Comment updateComments(long adPk, long id, Comment comment, Authentication authentication);
    void updateAdsImage(long id, MultipartFile image, Authentication authentication);
    /**
     * Получение из базы данных объявления с указанным id.
     */


}

