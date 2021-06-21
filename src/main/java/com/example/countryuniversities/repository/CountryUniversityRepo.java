package com.example.countryuniversities.repository;

import com.example.countryuniversities.models.CountryUniversity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CountryUniversityRepo
 */
@Repository
public interface CountryUniversityRepo extends JpaRepository<CountryUniversity, Long>{

    
}