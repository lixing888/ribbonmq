package com.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Cacheable(cacheNames = "user",key = "'findUser'")
    public String findUser(){
        System.out.println("查询了数据库");
        return "hellolixing";
    }
    @CacheEvict(cacheNames = "user",key = "'findUser'")
    public void delete(){
        System.out.println("删除了");
    }
}
