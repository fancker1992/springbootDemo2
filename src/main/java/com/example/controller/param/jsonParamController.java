package com.example.controller.param;

import com.example.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jsonParamController {
    /**
     * json 参数
     */
    @PostMapping("/jsonParam")
    public User jsonParam(@RequestBody User user) {
        System.out.println(user.toString());
        return user;
    }

}
