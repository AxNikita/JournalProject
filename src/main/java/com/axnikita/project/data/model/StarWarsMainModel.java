package com.axnikita.project.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StarWarsMainModel {

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("next")
    @Expose
    private String next;

    @SerializedName("previous")
    @Expose
    private Object previous;

    @SerializedName("results")
    @Expose
    private List<PlanetModel> planetList;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<PlanetModel> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<PlanetModel> planetList) {
        this.planetList = planetList;
    }

    @Override
    public String toString() {
        return "StarWarsMainModel{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous=" + previous +
                ", planetList=" + planetList +
                '}';
    }
}
