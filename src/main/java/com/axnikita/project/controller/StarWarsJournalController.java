package com.axnikita.project.controller;

import com.axnikita.project.component.StarWarsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/starWars")
public class StarWarsJournalController {

    @Autowired
    private StarWarsComponent starWarsComponent;

    @GetMapping("/planets")
    public String getStarWarsData(Model model) {
        model.addAttribute("planets", starWarsComponent.getAllPlanets());
        return "starWarsJournal";
    }

}
