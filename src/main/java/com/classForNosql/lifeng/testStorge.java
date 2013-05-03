package com.classForNosql.lifeng;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 5/2/13
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class testStorge {
    public static void main(String[] args){
        Person person=new Person();
        person.setName("lifeng");
        person.setAge(26);
//        Storage storage=new RedisStorageFactory().getStorage();
        RedisStorage storage=new RedisStorage();
        storage.set("lifeng",person);
        Person personRs=(Person)storage.get("lifeng");
        System.out.println(personRs.getAge());
        System.out.println(personRs.getName());
    }
}
