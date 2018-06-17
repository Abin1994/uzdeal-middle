package com.itcat.uzdealmiddle.Controller;

import com.alibaba.fastjson.JSONObject;
import com.itcat.uzdealmiddle.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFastJson {

    //直接返回对象
    @RequestMapping("testFastJson01")
    public User testFastJson(){

        User user = new User();
        user.setName("tom");
        user.setAge(15);
        return user;
    }

    //返回一个对象的Json
    @RequestMapping("testFastJson02")
    public String testFastJson02(){

        User user = new User();
        user.setName("lily");
        user.setAge(12);

        String jsontoString = JSONObject.toJSONString(user);

        System.out.println(user);
        System.out.println(jsontoString);
        return jsontoString;
    }




}
