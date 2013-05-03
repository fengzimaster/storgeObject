package com.classForNosql.lifeng;

import com.classForNosql.lifeng.ObjectSerialize.ObjectSerializeUtil;
import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class RedisStorage extends Storage {
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    private String host;
    private int port;
    public RedisStorage(String host, int port) {
        this.host = host;
        this.port = port;
    }
    public RedisStorage() {
        this.host = "127.0.0.1";
        this.port =6379;
    }

    @Override
    public boolean setToDB(String key, byte[] value) {
        Jedis redisConnection=new Jedis(host,port);
        return redisConnection.set(key.getBytes(),value).equals("OK");
    }

    @Override
    public byte[] getFromDB(String key) {
        Jedis redisConnection=new Jedis(host,port);
         return redisConnection.get(key.getBytes());
    }

}
