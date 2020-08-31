package com.jiang.myredisjedis.test;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class TxJedis {

    @Test
   public void testJedisTx(){
        //创建jedis对象
        Jedis jedis = new Jedis("192.168.1.104",6379);
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("hello","你好");
        jsonObject.put("world","世界");
        Transaction multi = jedis.multi();
        String result = jsonObject.toJSONString();
        try{
            multi.set("user1",result);
            multi.exec();
        }catch (Exception e){
            multi.discard();
        }
        System.out.println(jedis.get("user1"));
        jedis.close();
    }
}
