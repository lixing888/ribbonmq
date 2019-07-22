package com.test;

import com.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@EnableCaching
public class RedissonTest {

    @Autowired
    private RedissonClient redissonClient;
    @Test
    public void test(){
        Map<Object, Object> map = redissonClient.getMap("uuu");
        map.put("k1","value1");
        map.put("k2","value2");
        System.out.println(map.get("k1"));
    }
    @Test
    public void test1(){
        RLock lock = redissonClient.getLock("lock11");
        lock.lock();
        System.out.println("111");
        lock.unlock();
    }
    @Autowired
    private UserService userService;
    @Test
    public void test2(){
        System.out.println(userService.findUser());
        System.out.println(userService.findUser());
        userService.delete();
        System.out.println(userService.findUser());
        System.out.println(userService.findUser());
    }

}
