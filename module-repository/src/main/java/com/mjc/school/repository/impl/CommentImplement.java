package com.mjc.school.repository.impl;

import com.mjc.school.repository.CommentRepository;
import com.mjc.school.repository.model.Comments;
import com.mjc.school.repository.model.News;

import java.util.List;

public class CommentImplement extends AbstractRepo<Comments, Long> implements CommentRepository{

    @Override
    protected void setFields(Comments oldModel, Comments newModel) {
        oldModel.setContent(newModel.getContent());
        oldModel.setNews(newModel.getNews());
    }

    @Override
    public List<Comments> getCommentsByNewsId(Long newsId) {
        News newsModel = entityManager.find(News.class, newsId);
        return (List<Comments>) newsModel.getComments().stream();
    }
}


