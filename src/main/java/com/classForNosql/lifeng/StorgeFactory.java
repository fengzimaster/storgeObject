package com.classForNosql.lifeng;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:39 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class StorgeFactory {
    public abstract Storage getStorage();
    public abstract Storage getStorage(String host,int port);
}
