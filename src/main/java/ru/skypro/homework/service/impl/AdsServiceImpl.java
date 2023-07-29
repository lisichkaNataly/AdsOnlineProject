package ru.skypro.homework.service.impl;

import org.springframework.data.crossstore.ChangeSetPersister;
import ru.skypro.homework.entity.Ads;
import ru.skypro.homework.mapper.AdsMapper;
import ru.skypro.homework.mapper.AdsCommentMapper;
import ru.skypro.homework.repository.AdsRepository;
import ru.skypro.homework.repository.AdsCommentRepository;
import ru.skypro.homework.service.ImageService;
import ru.skypro.homework.service.UserService;

import java.util.NoSuchElementException;

public class AdsServiceImpl {
    private final UserService userService;
    private final ImageService imageService;
    private final AdsRepository adsRepository;
    private final AdsCommentRepository AdsCommentRepository;
    private final AdsMapper adsMapper;
    private final AdsCommentMapper adsCommentMapper;



}
