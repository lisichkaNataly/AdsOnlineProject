package ru.skypro.homework.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdsDto;
import ru.skypro.homework.dto.CreateAdsDto;
import ru.skypro.homework.dto.FullAdsDto;
import ru.skypro.homework.dto.ResponseWrapperAdsDto;
import ru.skypro.homework.service.AdsService;

import java.io.IOException;

@RestController
@RequestMapping("/ads")
@CrossOrigin(value = "http://localhost:3000")
@AllArgsConstructor
@Slf4j
public class AdsController {

    private final AdsService adsService;


    @GetMapping
    public ResponseEntity<ResponseWrapperAdsDto> getAdsAll() {
        return ResponseEntity.ok(adsService.getAdsAll());
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AdsDto> addAd(
            @RequestPart(name = "properties") CreateAdsDto createAdsDto,
            @RequestPart(name = "image") MultipartFile imageFile,
            Authentication authentication) throws IOException {
        return new ResponseEntity<>(adsService.createAd(createAdsDto, imageFile, authentication.getName()), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FullAdsDto> getAd(@PathVariable Integer id) {
        return ResponseEntity.ok(adsService.getAdInfo(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAd(@PathVariable Integer id, Authentication authentication) throws IOException {
        if (adsService.deleteAd(id, authentication.getName())) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
    }

    @GetMapping("/me")
    public ResponseEntity<ResponseWrapperAdsDto> getAdsMe(Authentication authentication) {
        return ResponseEntity.ok(adsService.getAdsMe(authentication.getName()));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<AdsDto> updateAd(@PathVariable Integer id,
                                           @RequestBody CreateAdsDto createAdsDto,
                                           Authentication authentication) {
        return adsService.updateAd(id, createAdsDto, authentication.getName())
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.FORBIDDEN).build());
    }

    @PatchMapping(value = "/{id}/image",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> updateImage(@PathVariable int id, @RequestParam MultipartFile image) throws IOException {
        log.info("Updating image for advertisement with id = " + id);
        return ResponseEntity.ok(adsService.editAdImage(id, image));
    }

    @GetMapping("/title/{titlePart}")
    public ResponseEntity<ResponseWrapperAdsDto> getAdsByNamePart(@PathVariable String titlePart) {
        return ResponseEntity.ok(adsService.getAdsByTitlePart(titlePart));
    }
}
