package com.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test(){
        //string
    /*    ValueOperations value = redisTemplate.opsForValue();
        value.set("kk","12312312");
        System.out.println(value.get("kk"));*/
        //set
       /* HashOperations hash = redisTemplate.opsForHash();
        hash.put("ss","k1","123");
        hash.put("ss","k2","222");
        hash.put("ss","k3","333");
        System.out.println(hash.get("ss","k2"));*/
       //删除某一个key
       // redisTemplate.delete("ss");
        //这个key是否存在
        System.out.println(redisTemplate.hasKey("ss"));
    }
}
