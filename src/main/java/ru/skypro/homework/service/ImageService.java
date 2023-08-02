package ru.skypro.homework.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.entity.Image;
import java.io.IOException;



public interface ImageService {

    Image uploadImage(MultipartFile imageFile) throws IOException;
    Image getImageById(long id);
    void remove(Image image);
}
