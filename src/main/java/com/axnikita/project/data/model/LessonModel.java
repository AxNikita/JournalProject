package com.axnikita.project.data.model;

public class LessonModel {
    private Long id;
    private String description;

    public LessonModel(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "LessonModel{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
