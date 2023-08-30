package com.mjc.school.repository.impl;

import com.mjc.school.repository.TagRepository;
import com.mjc.school.repository.model.News;
import com.mjc.school.repository.model.Tag;

import java.util.List;

public class TagsImplement extends AbstractRepo<Tag, Long>  implements TagRepository {

@Override
protected void setFields(Tag oldModel, Tag newModel) {
        oldModel.setName(newModel.getName());
        }

@Override
public List<Tag> getTagsByNewsId(Long newsId) {
        News newsModel = entityManager.find(News.class, newsId);
        return (List<Tag>) newsModel.getTags().stream();
        }
        }
