package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.entity.Comment;

import java.util.Collection;
import java.util.Optional;
@Repository
public interface AdsCommentRepository extends JpaRepository<Comment, Long> {
 Optional<Comment> findByIdAndAdId(long id, long adsId);

 Collection<Comment> findAllByAdId(long adId);

 void deleteCommentsByAdId(long id);
 }
