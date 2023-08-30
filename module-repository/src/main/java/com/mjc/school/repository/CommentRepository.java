package com.mjc.school.repository;

import com.mjc.school.repository.model.Comments;

import java.util.List;

public interface CommentRepository extends BaseRepository<Comments, Long> {
    List<Comments> getCommentsByNewsId (Long newsId);
}
