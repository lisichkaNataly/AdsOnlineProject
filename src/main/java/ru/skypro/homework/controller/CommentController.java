package ru.skypro.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ads")
@CrossOrigin(value = "http://localhost:3000")
public class CommentController {

    @GetMapping("/{id}/comments")
    public ResponseEntity<?> getComments() {
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<?> deleteComment() {
            return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/comments")
    public ResponseEntity<?> addComment() {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{adId}/comments/{commentId}")
    public ResponseEntity<?> updateComment() {
        return ResponseEntity.ok().build();
    }
}

