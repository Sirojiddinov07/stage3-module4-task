package com.mjc.school.repository.impl;

import com.mjc.school.repository.AuthorRepository;
import com.mjc.school.repository.model.Author;
import com.mjc.school.repository.model.News;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorImplement extends AbstractRepo<Author, Long> implements AuthorRepository {

    @Override
    protected void setFields(Author oldModel, Author newModel) {
        oldModel.setName(newModel.getName());
    }

    public Author getAuthorByNewsId(Long newsId){
        News news = entityManager.find(News.class, newsId);
        return news.getAuthor();
    }
}
