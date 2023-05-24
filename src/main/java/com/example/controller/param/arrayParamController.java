package com.example.controller.param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class arrayParamController {
    /**
     * 数组参数
     */
    @GetMapping("/arrayParam")
    public String[] arrayParam(String[] name) {
        System.out.println(Arrays.toString(name));
        return name;
    }
}
