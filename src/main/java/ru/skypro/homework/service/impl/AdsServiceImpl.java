package ru.skypro.homework.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsCommentDto;
import ru.skypro.homework.dto.CreateAdsDto;
import ru.skypro.homework.entity.Ads;
import ru.skypro.homework.entity.AdsComment;
import ru.skypro.homework.mapper.AdsMapper;
import ru.skypro.homework.mapper.AdsCommentMapper;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.repository.AdsCommentRepository;
import ru.skypro.homework.service.AdsService;
import ru.skypro.homework.service.ImageService;
import ru.skypro.homework.service.UserService;

import java.util.Collection;

@Transactional
@Service
public class AdsServiceImpl implements AdsService {
    private final UserService userService;
    private final ImageService imageService;
    private final AdsRepository adsRepository;
    private final AdsCommentRepository AdsCommentRepository;
    private final AdsMapper adsMapper;
    private final AdsCommentMapper adsCommentMapper;

    public AdsServiceImpl(UserService userService,
                          ImageService imageService,
                          AdsRepository adsRepository,
                          AdsCommentRepository adsCommentRepository,
                          AdsMapper adsMapper,
                          AdsCommentMapper adsCommentMapper) {
        this.userService = userService;
        this.imageService = imageService;
        this.adsRepository = adsRepository;
        AdsCommentRepository = adsCommentRepository;
        this.adsMapper = adsMapper;
        this.adsCommentMapper = adsCommentMapper;
    }


    @Override
    public Collection<Ads> getAllAds() {
        return adsRepository.findAll();
    }

    @Override
    public Collection<Ads> getAdsMe(Authentication authentication) {
        return null;
    }

    @Override
    public Ads getAdsById(Long adId) {
        return null;
    }

    @Override
    public Ads addAds(CreateAdsDto createAdsDto, MultipartFile imageFiles, Authentication authentication) {
        return null;
    }

    @Override
    public Ads removeAdsById(Long adId, Authentication authentication) {
        return null;
    }

    @Override
    public AdsComment getComment(long adPk, long id) {
        return null;
    }

    @Override
    public Collection<AdsComment> getComments(long adPk) {
        return null;
    }

    @Override
    public AdsComment addComments(long adPk, AdsCommentDto adsCommentDto, Authentication authentication) {
        return null;
    }

    @Override
    public AdsComment deleteComment(long adPk, long id, Authentication authentication) {
        return null;
    }

    @Override
    public Ads updateAds(Long adId, CreateAdsDto createAdsDto, Authentication authentication) {
        return null;
    }

    @Override
    public AdsComment updateComments(long adPk, long id, AdsComment comment, Authentication authentication) {
        return null;
    }

    @Override
    public void updateAdsImage(long id, MultipartFile image, Authentication authentication) {

    }
}
