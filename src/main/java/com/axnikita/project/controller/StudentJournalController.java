package com.axnikita.project.controller;

import com.axnikita.project.component.StudentJournalComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentJournalController {

    @Autowired
    private StudentJournalComponent studentJournalComponent;

    @GetMapping("/journal")
    public String getAllStudent(Model model) {
        model.addAttribute("studentList", studentJournalComponent.getAllStudent());
        return "studentJournal";
    }

    @GetMapping
    public String getStudentById(@RequestParam Long id, Model model) {
        model.addAttribute("student", studentJournalComponent.getStudentById(id));
        return "personalStudent";
    }

}
