package ru.skypro.homework.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.entity.Ads;
import ru.skypro.homework.mapper.AdsListMapper;
import ru.skypro.homework.mapper.AdsMapper;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.repository.CommentRepository;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class AdsService {

    public Ads getAdById(Integer id) {
        return null;
    }

    public AdsDto createAd() {
        return null;
    }

    public ResponseWrapperAdsDto getAdsAll() {
        return null;
    }

    public FullAdsDto getAdInfo(Integer id) {
        return null;
    }

    public boolean deleteAd(Integer id, String username)  {
        return false;
    }

    public Optional<AdsDto> updateAd(Integer id, String username) {
        return null;
    }
}

