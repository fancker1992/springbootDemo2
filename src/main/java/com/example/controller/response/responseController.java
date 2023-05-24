package com.example.controller.response;

import com.example.pojo.Result;
import com.example.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class responseController {

    @GetMapping("/getHello")
    public Result hello() {
        return Result.success();
    }

    /**
     * 返回单个user信息
     */
    @GetMapping("/getUser")
    public Result getUser() {
        User user = new User();
        user.setAge(18);
        user.setName("Tom");
        return Result.success(user);
    }

    /**
     * 返回user列表
     */
    @GetMapping("/getUserList")
    public Result getListUser() {
        ArrayList<User> userList = new ArrayList<>();

        User user = new User();
        user.setName("Tom");
        user.setAge(18);

        User user1 = new User();
        user1.setName("Bob");
        user1.setAge(20);

        userList.add(user);
        userList.add(user1);
        System.out.println(userList);
        return Result.success(userList);
    }


}
