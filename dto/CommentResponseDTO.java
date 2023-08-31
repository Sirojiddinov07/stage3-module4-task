package com.mjc.school.service.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentResponseDTO { private Long id;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
    private Long newsId;

    public CommentResponseDTO() {
    }

    public CommentResponseDTO(Long id, String content,
                              LocalDateTime createDate, LocalDateTime lastUpdateDate, Long newsId) {
        this.id = id;
        this.content = content;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.newsId = newsId;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");

        return "ServiceCommentResponseDto[" +
                "id=" + id +
                ", name='" + content + '\'' +
                ", createDate=" + formatter.format(createDate) +
                ", lastUpdateDate=" + formatter.format(lastUpdateDate) +
                ", newsId=" + newsId +
                ']';
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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }
}