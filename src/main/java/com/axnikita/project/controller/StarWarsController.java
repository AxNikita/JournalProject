package com.axnikita.project.controller;

import com.axnikita.project.component.StarWarsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StarWarsController {

    @Autowired
    private StarWarsComponent starWarsComponent;

    @GetMapping("/swapi")
    public String getStarWarsData(Model model) {
        starWarsComponent.getAllStudent();
        return "index";
    }

}
