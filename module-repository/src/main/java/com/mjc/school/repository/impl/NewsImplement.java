package com.mjc.school.repository.impl;

import com.mjc.school.repository.NewsRepository;
import com.mjc.school.repository.model.Author;
import com.mjc.school.repository.model.News;
import com.mjc.school.repository.model.Tag;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

public class NewsImplement extends AbstractRepo<News, Long> implements NewsRepository {


    @Override
    protected void setFields(News oldModel, News newModel) {
        oldModel.setTitle(newModel.getTitle());
        oldModel.setContent(newModel.getContent());
        oldModel.setAuthor(newModel.getAuthor());
        oldModel.setTags(newModel.getTags());
    }


    public List<News> readByParams(Long tagId, String tagName, String authorName, String title, String content){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<News> cr = cb.createQuery(News.class);
        Root<News> root = cr.from(News.class);

        Join<News, Tag> tags = root.join("tags");
        Join<News, Author> author = root.join("author");

        if (tagId != null){
            Predicate tagIdCheck = cb.equal(tags.get("id"), tagId);
            cr.select(root).where(tagIdCheck);
        }
        if (tagName != null && !tagName.trim().isEmpty()){
            Predicate tagNameCheck = cb.equal(tags.get("name"), tagName);
            cr.select(root).where(tagNameCheck);
        }
        if ((authorName != null) && !authorName.trim().isEmpty()){
            Predicate authorCheck = cb.equal(author.get("name"), authorName);
            cr.select(root).where(authorCheck);
        }
        if (title != null && !title.trim().isEmpty()){
            Predicate titleCheck  = cb.equal(root.get("title"), title);
            cr.select(root).where(titleCheck);
        }
        if (content != null && !content.trim().isEmpty()){
            Predicate contentCheck  = cb.equal(root.get("content"), content);
            cr.select(root).where(contentCheck);
        }

        TypedQuery<News> query = entityManager.createQuery(cr);
        return query.getResultList();
    }

}
