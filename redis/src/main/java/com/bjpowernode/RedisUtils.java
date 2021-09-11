package com.bjpowernode;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
  private static JedisPool pool=null;

     //创建连接池
    public static JedisPool open(String host,int port){
        if(pool==null){
            JedisPoolConfig config=new JedisPoolConfig();
            //最大连接数
            config.setMaxTotal(10);
            config.setMaxIdle(5);
            pool=new JedisPool(config,host,port);
        }

        return pool;
    }

    public static void close(){
        if(pool!=null){
            pool.close();
        }

    }

}
