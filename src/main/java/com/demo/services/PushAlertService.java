package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PushAlertService {

    @Autowired
    private RestTemplate restTemplate;

    public void pushAlert() {
        restTemplate.exchange("", )
    }


}
