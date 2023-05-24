package com.example.controller.param;


import com.example.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simplePojoController {
    /*
    简单实体参数，注意传参形式并非JSON
     */
    @GetMapping("/simplePojo")
    public User simplePojo(User user) {

        return user;
    }

}
