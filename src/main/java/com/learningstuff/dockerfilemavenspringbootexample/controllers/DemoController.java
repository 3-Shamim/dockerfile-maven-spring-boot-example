package com.learningstuff.dockerfilemavenspringbootexample.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১২/১১/১৯
 * Time: ১০:৩৫ AM
 * Email: mdshamim723@gmail.com
 **/

@RestController
public class DemoController {

    @GetMapping(value = "/hello")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello, it is very nice to get a response.");
    }

}
