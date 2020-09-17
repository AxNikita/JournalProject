package com.axnikita.project.component;

import com.axnikita.project.data.model.AppraisalModel;
import com.axnikita.project.data.model.LessonModel;
import com.axnikita.project.data.model.StudentModel;
import com.axnikita.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentJournalComponent {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> getAllStudent() {
        return studentRepository.getAllStudent();
    }

    public StudentModel getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }

    public List<AppraisalModel> getAllAppraisalByStudentId(Long id) {
        return studentRepository.getAllAppraisalByStudentId(id);
    }

    public List<LessonModel> getAllLessons() {
        return studentRepository.getAllLessons();
    }

}
