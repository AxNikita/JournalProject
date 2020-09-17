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

    private String nextUrl;
    private String previousUrl;
    List<StarWarsPlanetModel> planetList = new ArrayList<>();

    @Autowired
    private StarWarsRepository starWarsRepository;

    public StarWarsMainModel getBaseStarWarsData() {
        return starWarsRepository.getAllStarWarsData();
    }

    public List<StarWarsPlanetModel> getBasePlanets() {
        planetList.clear();
        StarWarsMainModel starWarsData = getBaseStarWarsData();
        nextUrl = starWarsData.getNext();
        previousUrl = starWarsData.getPrevious();
        planetList.addAll(starWarsData.getPlanetList());
        return planetList;
    }//http://swapi.dev/api/planets/?page=2

    public List<StarWarsPlanetModel> getNextPlanets() {
        planetList.clear();
        if (nextUrl != null) {
            StarWarsMainModel starWarsData = starWarsRepository.getNextPage(nextUrl.substring(35, 36));
            nextUrl = starWarsData.getNext();
            previousUrl = starWarsData.getPrevious();
            planetList.addAll(starWarsData.getPlanetList());
        } else {
            planetList.addAll(getBasePlanets());
        }
        return planetList;
    }

    public List<StarWarsPlanetModel> getPreviousPlanets() {
        planetList.clear();
        if (previousUrl != null) {
            StarWarsMainModel starWarsData = starWarsRepository.getNextPage(previousUrl.substring(35, 36));
            nextUrl = starWarsData.getNext();
            previousUrl = starWarsData.getPrevious();
            planetList.addAll(starWarsData.getPlanetList());
        } else {
            planetList.addAll(getBasePlanets());
        }
        return planetList;
    }

}
