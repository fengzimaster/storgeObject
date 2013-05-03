package com.classForNosql.lifeng;

import com.classForNosql.lifeng.ObjectSerialize.ObjectSerializeUtil;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */

public abstract class Storage {
    // template pattern
    public abstract boolean setToDB(String key,byte[] value);   // different DB accomplish this method
    public abstract byte[] getFromDB(String key);              // different DB accomplish this method

    public boolean set (String key,Object object) {     // finish the serialize of the object before set into DB
        return setToDB(key, ObjectSerializeUtil.serialize(object));
    }
    public  Object get(String key){
        return ObjectSerializeUtil.dserialize((byte[]) getFromDB(key));  //finish the deserialize of the bytes get from DB
    }

}
