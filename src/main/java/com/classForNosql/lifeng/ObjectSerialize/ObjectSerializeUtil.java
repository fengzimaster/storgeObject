package com.classForNosql.lifeng.ObjectSerialize;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectSerializeUtil {
    public static byte[] serialize(Object o){
        ObjectOutputStream oos=null;
        ByteArrayOutputStream baos= new ByteArrayOutputStream();
        byte[] bytes=null;

        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(o);
            baos.close();
            oos.close();
            bytes=baos.toByteArray();


        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return bytes;
    }
    public static Object dserialize(byte[] b){
        Object rv=null;
        ByteArrayInputStream bais =new ByteArrayInputStream(b);
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(bais);
            rv=ois.readObject();
            bais.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return rv;
    }
}
