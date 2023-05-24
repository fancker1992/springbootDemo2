package com.example.controller.param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleParamController {
    /**
     * 简单参数
     */
    @GetMapping("/simpleParam")
    public String simpleParam(String name, int age) {
        return name + ":" + age;
    }


}
