package com.demo.services;

import com.demo.domain.DummyUser;
import com.demo.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public DummyUser createDummyUsers(DummyUser user){
        return demoRepository.saveDummyUser(user);
    }
}
