package com.jiang.redisspring;

import com.jiang.redisspring.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisSpringApplicationTests {
  @Autowired
  private RedisTemplate redisTemplate;

  @Autowired
  private RedisUtil redisUtil;

  @Test
  public  void test2(){
    redisUtil.set("name","大江哥");
    System.out.println(redisUtil.get("name"));
  }

  @Test
  void contextLoads() {
    redisTemplate.opsForValue().set("name","大江哥");//操作字符串

    System.out.println(redisTemplate.opsForValue().get("name"));

  }
}
