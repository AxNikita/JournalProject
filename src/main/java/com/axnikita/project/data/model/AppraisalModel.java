package com.axnikita.project.data.model;

public class AppraisalModel {
    private Long id;
    private Long studentId;
    private Long lessonId;
    private Integer value;

    public AppraisalModel(Long id, Long studentId, Long lessonId, Integer value) {
        this.id = id;
        this.studentId = studentId;
        this.lessonId = lessonId;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AppraisalModel{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", lessonId='" + lessonId + '\'' +
                ", value=" + value +
                '}';
    }
}
