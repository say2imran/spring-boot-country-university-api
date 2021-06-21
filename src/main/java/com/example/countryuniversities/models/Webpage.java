package com.example.countryuniversities.models;

import java.util.List;

import javax.persistence.Embeddable;

/**
 * webpage
 */
@Embeddable
 public class Webpage {
    private String webpage;


    public String getWebpage() {
        return this.webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }


    @Override
    public String toString() {
        return "{" +
            " webpage='" + getWebpage() + "'" +
            "}";
    }

}