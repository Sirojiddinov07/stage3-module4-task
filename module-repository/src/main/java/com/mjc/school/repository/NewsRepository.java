package com.mjc.school.repository;

import com.mjc.school.repository.model.News;

import java.util.List;

public interface NewsRepository extends BaseRepository<News, Long> {
    List<News> readByParams(Long tagId, String tagName, String authorName, String title, String content);
}
