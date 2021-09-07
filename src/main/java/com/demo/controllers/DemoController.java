package com.demo.controllers;

import com.demo.domain.DummyUser;
import com.demo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @PostMapping("/user")
    public ResponseEntity createDummyUser(HttpServletRequest request, @RequestBody DummyUser user) {
        DummyUser dummyUser = demoService.createDummyUsers(user);
        return  ResponseEntity.ok(dummyUser);
    }

    @GetMapping("/user")
    public ResponseEntity getUSer (HttpServletRequest request, @PathVariable Integer userId) {
        // DummyUser dummyUser = demoService.createDummyUsers(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity testApi() {
        return ResponseEntity.status(HttpStatus.OK).body("API RESPONSE ALL OK");
    }
}
