package ru.skypro.homework.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.CommentDto;
import ru.skypro.homework.entity.Comment;

@Service
@AllArgsConstructor
@Slf4j
public class CommentService {


    public CommentDto addComment() {
        return null;
    }

    public boolean deleteComment(Integer commentId, String username) {
        return false;
    }

    public Comment getCommentById(Integer id) {
        return null;
    }


}


