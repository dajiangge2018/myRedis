package com.jiang.myredisjedis.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class TestJedisCon {

    @Test
    public void testPingRedis(){
        //创建jedis对象
        Jedis jedis = new Jedis("192.168.1.104",6379);
        System.out.println(jedis.ping());
    }

}
