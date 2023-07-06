package ru.skypro.homework.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.entity.Ads;
import ru.skypro.homework.entity.Image;
import ru.skypro.homework.entity.User;
import ru.skypro.homework.mapper.AdsListMapper;
import ru.skypro.homework.mapper.AdsMapper;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.repository.CommentRepository;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class AdsService {

    private final AdsRepository adsRepository;
    private final AdsMapper mapper;
    private final UserService userService;
    private final ImageService imageService;
    private final CommentRepository commentRepository;

    public Ads getAdById(Integer id) {
        return adsRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Ad with id=" + id + " not found!"));
    }

    public AdsDto createAd(CreateAdsDto createAdsDto, MultipartFile imageFile, String username) throws IOException {
        Ads ad = mapper.toAds(createAdsDto);
        User author = userService.getUserByUsername(username);
        ad.setAuthor(author);
        ad.setImage(imageService.uploadImage(imageFile));
        return mapper.toDto(adsRepository.save(ad));
    }

    public ResponseWrapperAdsDto getAdsAll() {
        return null;
    }

    public FullAdsDto getAdInfo(Integer id) {
        return null;
    }

    public boolean deleteAd(Integer id, String username) throws IOException {
        User user = userService.getUserByUsername(username);
        Ads ad = getAdById(id);
        if (user.equals(ad.getAuthor()) || user.getRole() == Role.ADMIN) {
            Image image = ad.getImage();
            commentRepository.deleteAll(ad.getCommentsList());
            adsRepository.delete(ad);
            imageService.deleteImage(image);
            return true;
        } else {
            return false;
        }
    }

    public Optional<AdsDto> updateAd(Integer id, String username) {
        return null;
    }
}

