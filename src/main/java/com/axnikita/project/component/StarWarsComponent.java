package com.axnikita.project.component;

import com.axnikita.project.data.model.StarWarsMainModel;
import com.axnikita.project.repository.StarWarsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StarWarsComponent {

    @Autowired
    private StarWarsRepository starWarsRepository;

    public StarWarsMainModel getAllStudent() {
        return starWarsRepository.getAllStarWarsData();
    }
}
