package com.mjc.school.service.dto;

import java.util.List;
import java.util.Set;

public class NewsRequestDTO{
    private Long id;
    private String title;
    private String content;
    private Long authorId;
    private List<Long> newsTagsIds;

    public NewsRequestDTO(Long id, String title, String content,
                          Long authorId, List<Long> newsTagsIds) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.newsTagsIds = newsTagsIds;
    }

    public NewsRequestDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public List<Long> getNewsTagsIds() {
        return newsTagsIds;
    }

    public Set<Long> setNewsTagsIds() {
        this.newsTagsIds = newsTagsIds;
        return null;
    }
}