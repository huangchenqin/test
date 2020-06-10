package com.test.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "my hello world";
    }

//    @GetMapping("/helloworld1")
//    public String helloworld1() {
//        return "helloworld1";
//    }
//
//    @GetMapping("/helloworld2")
//    public String helloworld2() {
//        return "helloworld2";
//    }
//
//    @GetMapping("/helloworld3")
//    public String helloworld3() {
//        return "helloworld3";
//    }
}