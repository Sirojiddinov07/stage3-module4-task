package com.mjc.school.service.dto;

public class TagResponseDTO { private Long id;
    private String name;

    public TagResponseDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TagResponseDTO() {
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

    @Override
    public String toString() {
        return "TagResponseDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}