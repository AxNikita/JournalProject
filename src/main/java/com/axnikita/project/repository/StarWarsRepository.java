package com.axnikita.project.repository;

import com.axnikita.project.data.model.StarWarsMainModel;
import com.axnikita.project.service.SWApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StarWarsRepository {

    @Autowired
    private SWApi swApi;

    public StarWarsMainModel getAllStarWarsData() {
        return swApi.getStarWarsData();
    }

}
