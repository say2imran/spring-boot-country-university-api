package com.example.countryuniversities.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import javax.annotation.PostConstruct;

import com.example.countryuniversities.models.CountryUniversity;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@NoArgsConstructor
public class GetCountryUniversityDataService {
    private final String url = "http://universities.hipolabs.com/search?country=India";

    @PostConstruct
    public void getCountryUniversity() throws IOException, InterruptedException, URISyntaxException{
        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder()
        //       .uri(URI.create(url + country))
        //       .build();
    
        //HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        //HttpResponse<String> response = client.send(request, new JSONObject<>(CountryUniversity.class));
        //JSONObject response = client.send(request, new JSONObject<>(CountryUniversity.class));
        //System.out.println(response.body());
        
        RestTemplate restTemplate = new RestTemplate();

        URI uri = new URI(url);
        //ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        //ResponseEntity<CountryUniversity> result = restTemplate.getForObject(uri, CountryUniversity.class.getClass());
        ResponseEntity<List<CountryUniversity>> result = restTemplate.exchange(
          uri, HttpMethod.GET, null,
          new ParameterizedTypeReference<List<CountryUniversity>>(){});

        System.out.println("_________________________________TEST______STARTS_____");
        System.out.println(result.getBody().size());
        System.out.println("_________________________________TEST______ENDS_____");
    
        }    

    
}
