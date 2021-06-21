package com.example.countryuniversities.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.example.countryuniversities.models.CountryUniversity;
import com.example.countryuniversities.models.CountryUniversitySourceAPIResponse;
import com.example.countryuniversities.repository.CountryUniversityRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.TypeInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
public class GetCountryUniversityDataService {
  private final String url = "http://universities.hipolabs.com/search?country=India";
  
  @Autowired
  CountryUniversityRepo countryUniversityRepo;

  @PostConstruct
  public void getCountryUniversity() throws URISyntaxException {
    RestTemplate restTemplate = new RestTemplate();

    URI uri = new URI(url);
    ResponseEntity<List<CountryUniversitySourceAPIResponse>> result = restTemplate.exchange(uri, HttpMethod.GET, null,
        new ParameterizedTypeReference<List<CountryUniversitySourceAPIResponse>>() {
        });

    System.out.println("_________________________________TEST______STARTS_____");
    //result.getBody().stream().forEach(item -> System.out.println(item.getCountry()));
    //result.getBody().stream().forEach(item -> System.out.println(item.getName()));    GET NAME only
    //result.getBody().stream().forEach(item -> System.out.println(item.getName()));

    List<CountryUniversitySourceAPIResponse> fetchedData = result.getBody();

    System.out.println();
    //fetchedData.forEach(action);
    //.forEach(item -> System.out.println(item.toString())));
    System.out.println("_________________________________TEST______ENDS_____");
    List<CountryUniversity> countryUniversitiesList = new ArrayList<>();

    // for (CountryUniversitySourceAPIResponse data : fetchedData){
    //   CountryUniversity countryUniversity = new CountryUniversity();
    //   countryUniversity.setCountry(data.getCountry());
    //   countryUniversity.setStateProvince(data.getStateProvince());
    //   countryUniversity.setName(data.getName());
    //   countryUniversity.setAlphaTwoCode(data.getAlphaTwoCode());
    //   countryUniversity.setWebPages(data.getWebPages());
    //   countryUniversity.setDomains(data.getDomains());
    //   //System.out.println(data.getWebPages());
    //   countryUniversitiesList.add(countryUniversity);
    // }
    

    //fetchedData.stream().forEach(s -> {new CountryUniversity(
      countryUniversitiesList = fetchedData.stream().map(s -> {return new CountryUniversity(
      s.getCountry(), 
      s.getStateProvince(),
      s.getName(),
      s.getAlphaTwoCode(),
      s.getWebPages(),
      s.getDomains());
    }).collect(Collectors.toList());
    
    System.out.println(countryUniversitiesList);
    countryUniversityRepo.saveAll(countryUniversitiesList);
    

  }

}
