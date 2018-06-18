package com.itcat.uzdealmiddle.Controller;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
public class testRedis {

    @RequestMapping("testRedis")
    public String testRedis(){
        return "";
    }

    @RequestMapping("/testRedis1")
    public String testRedis1(){
        return "testRedis1";
    }

}
