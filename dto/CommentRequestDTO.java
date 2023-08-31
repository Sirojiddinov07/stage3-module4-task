package com.mjc.school.service.dto;

public class CommentRequestDTO {
    private Long id;
    private String content;
    private Long newsId;

    public CommentRequestDTO(Long id, String content, Long newsId) {
        this.id = id;
        this.content = content;
        this.newsId = newsId;
    }

    public CommentRequestDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }
}
