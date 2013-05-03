package com.classForNosql.lifeng;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class RedisStorageFactory extends StorgeFactory {
    @Override
    public Storage getStorage() {
        return new RedisStorage();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Storage getStorage(String host, int port) {
        return new RedisStorage(host,port);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
