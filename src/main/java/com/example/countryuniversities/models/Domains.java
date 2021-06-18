package com.example.countryuniversities.models;

import java.util.List;


/**
 * domains
 */

public class Domains {
    private List<String> domains;


    public List<String> getDomains() {
        return this.domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }


    public Domains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "{" +
            " domains='" + getDomains() + "'" +
            "}";
    }
    
}