package com.axnikita.project.repository;

import com.axnikita.project.data.model.StarWarsMainModel;
import com.axnikita.project.service.StarWarsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StarWarsRepository {

    @Autowired
    private StarWarsApi starWarsApi;

    public StarWarsMainModel getAllStarWarsData() {
        return starWarsApi.getStarWarsData();
    }

    public StarWarsMainModel getNextPage(String url) {
        return starWarsApi.getNextPage(url);
    }

}
