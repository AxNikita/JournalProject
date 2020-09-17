package com.axnikita.project.component;

import com.axnikita.project.data.model.StarWarsPlanetModel;
import com.axnikita.project.data.model.StarWarsMainModel;
import com.axnikita.project.repository.StarWarsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StarWarsComponent {

    @Autowired
    private StarWarsRepository starWarsRepository;

    public List<StarWarsPlanetModel> getAllPlanets() {

        List<StarWarsPlanetModel> planetList = new ArrayList<>();

        StarWarsMainModel starWarsData = starWarsRepository.getAllStarWarsData();

        planetList.addAll(starWarsData.getPlanetList());

        return planetList;
    }

}
