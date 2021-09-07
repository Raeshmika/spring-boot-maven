package com.demo.services;


import com.demo.domain.Developer;
import com.demo.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    public List<Developer> saveDevelopersWithTeams(List<Developer> developers) {
        developerRepository.saveDeveloper(developers);
    }




}
