package ru.skypro.homework.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController {
    @PostMapping("/set_password")
    public ResponseEntity<?> setPassword() {
            return ResponseEntity.ok().build();
    }

    @GetMapping("/me")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/me")
    public ResponseEntity<?> updateUser() {
        return ResponseEntity.ok().build();
    }

    @PatchMapping(value = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> updateUserImage() {
        return ResponseEntity.ok().build();
    }
}
