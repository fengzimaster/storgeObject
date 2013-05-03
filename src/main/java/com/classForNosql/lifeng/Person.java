package com.classForNosql.lifeng;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: lifeng
 * Date: 4/26/13
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Serializable {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
