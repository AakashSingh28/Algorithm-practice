package com.practice.array;

import java.util.Comparator;

/**
 * Created by aasingh on 13/06/18.
 */
public class Employee{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(Object o) {
        Employee employee=(Employee)o;
        return this.getName().compareTo(employee.getName());
    }*/
}
