package com.example.countryuniversities.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"state-province",
"web_pages",
"alpha_two_code",
"country",
"name",
"domains"
})
@Generated("jsonschema2pojo")
public class CountryUniversity {

@JsonProperty("state-province")
private String stateProvince;
@JsonProperty("web_pages")
private List<String> webPages = null;
@JsonProperty("alpha_two_code")
private String alphaTwoCode;
@JsonProperty("country")
private String country;
@JsonProperty("name")
private String name;
@JsonProperty("domains")
private List<String> domains = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("state-province")
public String getStateProvince() {
return stateProvince;
}

@JsonProperty("state-province")
public void setStateProvince(String stateProvince) {
this.stateProvince = stateProvince;
}

@JsonProperty("web_pages")
public List<String> getWebPages() {
return webPages;
}

@JsonProperty("web_pages")
public void setWebPages(List<String> webPages) {
this.webPages = webPages;
}

@JsonProperty("alpha_two_code")
public String getAlphaTwoCode() {
return alphaTwoCode;
}

@JsonProperty("alpha_two_code")
public void setAlphaTwoCode(String alphaTwoCode) {
this.alphaTwoCode = alphaTwoCode;
}

@JsonProperty("country")
public String getCountry() {
return country;
}

@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("domains")
public List<String> getDomains() {
return domains;
}

@JsonProperty("domains")
public void setDomains(List<String> domains) {
this.domains = domains;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

// import java.util.UUID;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.SequenceGenerator;

// import lombok.Data;

// /**
//  * countryUniversity
//  */
// @Data
// @Entity
// public class CountryUniversity {
    
//     @Id
//     @GeneratedValue(
//         strategy = GenerationType.SEQUENCE,
//         generator = "id_sequence")
//     @SequenceGenerator(
//         name = "id_sequence",
//         allocationSize = 1)
//     private Long id;

//     private String country;
//     private String stateProvince;
//     private String name;
//     private String alphaTwoCode;
//     private Webpage webPages;
//     private Domains domains;
    

//     public CountryUniversity(String country, String stateProvince, String name, String alphaTwoCode, Webpage webPages, Domains domains) {
//         this.country = country;
//         this.stateProvince = stateProvince;
//         this.name = name;
//         this.alphaTwoCode = alphaTwoCode;
//         this.webPages = webPages;
//         this.domains = domains;
//     }

//     public String getCountry() {
//         return this.country;
//     }

//     public void setCountry(String country) {
//         this.country = country;
//     }

//     public String getStateProvince() {
//         return this.stateProvince;
//     }

//     public void setStateProvince(String stateProvince) {
//         this.stateProvince = stateProvince;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getAlphaTwoCode() {
//         return this.alphaTwoCode;
//     }

//     public void setAlphaTwoCode(String alphaTwoCode) {
//         this.alphaTwoCode = alphaTwoCode;
//     }

//     public Webpage getWebPages() {
//         return this.webPages;
//     }

//     public void setWebPages(Webpage webPages) {
//         this.webPages = webPages;
//     }

//     public Domains getDomains() {
//         return this.domains;
//     }

//     public void setDomains(Domains domains) {
//         this.domains = domains;
//     }


//     @Override
//     public String toString() {
//         return "{" +
//             " country='" + getCountry() + "'" +
//             ", stateProvince='" + getStateProvince() + "'" +
//             ", name='" + getName() + "'" +
//             ", alphaTwoCode='" + getAlphaTwoCode() + "'" +
//             ", webPages='" + getWebPages() + "'" +
//             ", domains='" + getDomains() + "'" +
//             "}";
//     }

//     // {
//     //     "state-province": "Punjab",
//     //     "web_pages": [
//     //         "http://www.davietjal.org/"
//     //     ],
//     //     "alpha_two_code": "IN",
//     //     "country": "India",
//     //     "name": "DAV Institute of Engineering & Technology",
//     //     "domains": [
//     //         "davietjal.org"
//     //     ]
//     // },
// }