package com.example.countryuniversities.models;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "CountryUniversity")
public class CountryUniversity {
    
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "id_sequence")
    @SequenceGenerator(
        name = "id_sequence",
        allocationSize = 1)
    private Long id;

    private String country;
    private String stateProvince;
    private String name;
    private String alphaTwoCode;
    
    @ElementCollection
    //@OneToMany
    @CollectionTable(name = "webpage", joinColumns = @JoinColumn(name="country_univ_id"))
    @Column(name = "webpage_link")
    private List<String> webPages;


    @ElementCollection
    //@OneToMany
    @CollectionTable(name = "domains", joinColumns = @JoinColumn(name="country_univ_id"))
    @Column(name = "domain_name")
    private List<String> domains;
    


    public CountryUniversity(String country, String stateProvince, String name, String alphaTwoCode, List<String> webPages, List<String> domains) {
        this.country = country;
        this.stateProvince = stateProvince;
        this.name = name;
        this.alphaTwoCode = alphaTwoCode;
        this.webPages = webPages;
        this.domains = domains;
    }
    

}