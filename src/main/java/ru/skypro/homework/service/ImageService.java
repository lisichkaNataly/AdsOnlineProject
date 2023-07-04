package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.entity.Image;

@Service
public class ImageService {

    public Image uploadImage(MultipartFile imageFile) {
        Image image = new Image();

        return null;
    }

    public void deleteImage(Image image) {

    }
}
