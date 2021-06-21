package com.example.countryuniversities.models;

import java.util.List;

import javax.persistence.Embeddable;


/**
 * domains
 */

 @Embeddable
public class Domains {
    private String domains;



    public String getDomains() {
        return this.domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }


    @Override
    public String toString() {
        return "{" +
            " domains='" + getDomains() + "'" +
            "}";
    }


    
}