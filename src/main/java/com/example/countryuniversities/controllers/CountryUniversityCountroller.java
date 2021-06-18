package com.example.countryuniversities.controllers;

import java.io.IOException;
import java.net.URISyntaxException;

import com.example.countryuniversities.services.GetCountryUniversityDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/country")
public class CountryUniversityCountroller {

    @Autowired
    GetCountryUniversityDataService getCountryUniversityDataService;

    // @Autowired
    // public CountryUniversityCountroller(GetCountryUniversityDataService getCountryUniversityDataService) {
    //     this.getCountryUniversityDataService = getCountryUniversityDataService;
    // }


    @GetMapping
    public void getCountryUniversity() throws IOException, InterruptedException, URISyntaxException{
        getCountryUniversityDataService.getCountryUniversity();

    }
    
}
