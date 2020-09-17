package com.axnikita.project.service;

import com.axnikita.project.data.model.StarWarsMainModel;
import feign.RequestLine;

public interface SWApi {
//    @RequestLine("GET/{isbn}")
//    BookResource findByIsbn(@Param("isbn") String isbn);

    @RequestLine("GET")
    StarWarsMainModel getStarWarsData();

//    @RequestLine("POST")
//    @Headers("Content-Type: application/json")
//    void create(Book book);
}
