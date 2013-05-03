package com.classForNosql.lifeng;
/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class MongoStorage extends Storage {
//    protected MongoStorage(String DBName) {
//        super(DBName);
//    }
    private String host;
    private int port;

    public MongoStorage() {
        this.host="127.0.0.1";
        port= 11211;
    }
    public MongoStorage(String host, int port) {

        this.host = host;
        this.port = port;
    }

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
   // accomplish the MongoDB connnection method

    @Override
    public boolean setToDB(String key, byte[] value) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public byte[] getFromDB(String key) {
        return new byte[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

}
