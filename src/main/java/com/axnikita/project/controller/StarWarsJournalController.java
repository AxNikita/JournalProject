package com.axnikita.project.controller;

import com.axnikita.project.component.StarWarsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/starWars/planets")
public class StarWarsJournalController {

    @Autowired
    private StarWarsComponent starWarsComponent;

    @GetMapping("/base")
    public String getBasePlanets(Model model) {
        model.addAttribute("planets", starWarsComponent.getBasePlanets());
        return "starWarsJournal";
    }

    @GetMapping("/next")
    public String getNextPlanets(Model model) {
        model.addAttribute("planets", starWarsComponent.getNextPlanets());
        return "starWarsJournal";
    }

    @GetMapping("/previous")
    public String getPreviousPlanets(Model model) {
        model.addAttribute("planets", starWarsComponent.getPreviousPlanets());
        return "starWarsJournal";
    }

}
