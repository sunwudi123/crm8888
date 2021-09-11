package com.bjpowernode;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

public class App 
{
    public static void main( String[] args )
    {

         /*Jedis jedis=new Jedis("192.168.150.128",6379);
         jedis.flushAll();
         jedis.set("name","tom");
         String name=jedis.get("name");
         System.out.println(name);*/

         Jedis jedis = new Jedis("192.168.15.129",6379);
         jedis.flushAll();
        jedis.set("name","tom");
        String name=jedis.get("name");
        System.out.println(name);

    }
}
