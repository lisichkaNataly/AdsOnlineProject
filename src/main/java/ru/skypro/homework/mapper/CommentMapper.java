package ru.skypro.homework.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import ru.skypro.homework.dto.CommentDto;
import ru.skypro.homework.entity.Comment;
import ru.skypro.homework.entity.Image;
import ru.skypro.homework.entity.User;

import java.util.Objects;


@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CommentMapper {

    default CommentDto toDto(Comment comment) {

        if (comment == null) {
            return null;
        }

        CommentDto commentDto = new CommentDto();
        commentDto.setPk(comment.getCommentId());
        commentDto.setText(comment.getText());

        commentDto.setCreatedAt(Objects.requireNonNullElse(comment.getCreatedAt(), 0L));

        User author = comment.getAuthor();
        if (author != null) {

            commentDto.setAuthor(comment.getAuthor().getId());
            commentDto.setAuthorFirstName(comment.getAuthor().getFirstName());

            Image image = author.getImage();
            if (image != null) {
                commentDto.setAuthorImage("/image/" + comment.getAuthor().getImage().getId());
            }
        }

        return commentDto;
    }



}
