package com.mjc.school.service.dto;

public class TagRequestDTO{
    private Long id;
    private String name;

    public TagRequestDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TagRequestDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
