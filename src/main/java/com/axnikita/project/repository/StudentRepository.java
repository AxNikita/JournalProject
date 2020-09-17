package com.axnikita.project.repository;

import com.axnikita.project.data.model.AppraisalModel;
import com.axnikita.project.data.model.LessonModel;
import com.axnikita.project.data.model.StudentModel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private List<StudentModel> studentList = new ArrayList<>();
    private List<LessonModel> lessonList = new ArrayList<>();
    private List<AppraisalModel> appraisalList = new ArrayList<>();

    @PostConstruct
    public void initMethod() {
        studentList.add(new StudentModel(1L, "Nikita", "Surname1", 19));
        studentList.add(new StudentModel(2L, "Egor", "Surname2", 20));
        studentList.add(new StudentModel(3L, "Roma", "Surname3", 21));
        studentList.add(new StudentModel(4L, "Andrey", "Surname4", 22));
        studentList.add(new StudentModel(5L, "Alexander", "Surname5", 23));

        lessonList.add(new LessonModel(1L, "Математика"));
        lessonList.add(new LessonModel(2L, "Русский"));
        lessonList.add(new LessonModel(3L, "История"));
        lessonList.add(new LessonModel(4L, "Информатика"));

        appraisalList.add(new AppraisalModel(1L, 1L, 1L, 5));
        appraisalList.add(new AppraisalModel(2L, 1L, 2L, 4));
        appraisalList.add(new AppraisalModel(3L, 1L, 3L, 3));
        appraisalList.add(new AppraisalModel(4L, 3L, 1L, 5));
        appraisalList.add(new AppraisalModel(5L, 4L, 2L, 4));
        appraisalList.add(new AppraisalModel(6L, 5L, 3L, 3));
    }

    public List<StudentModel> getAllStudent() {
        return studentList;
    }

    public StudentModel getStudentById(Long id) {
        for (StudentModel student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;

    }

}
