package com.axnikita.project.repository;

import com.axnikita.project.data.model.StudentModel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {

    private List<StudentModel> studentList = new ArrayList<>();

    @PostConstruct
    public void initMethod() {
        studentList.add(new StudentModel(1L, "Nik1", "Kot1", 19));
        studentList.add(new StudentModel(2L, "Nik2", "Kot2", 20));
        studentList.add(new StudentModel(3L, "Nik3", "Kot3", 21));
        studentList.add(new StudentModel(4L, "Nik4", "Kot4", 22));
        studentList.add(new StudentModel(5L, "Nik5", "Kot5", 23));
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
