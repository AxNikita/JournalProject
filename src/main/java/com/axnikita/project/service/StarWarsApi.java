package com.axnikita.project.service;

import com.axnikita.project.data.model.StarWarsMainModel;
import feign.Param;
import feign.RequestLine;

public interface StarWarsApi {

    @RequestLine("GET")
    StarWarsMainModel getStarWarsData();

    @RequestLine("GET/{url}")
    StarWarsMainModel getNextPage(@Param("url") String url);

}
