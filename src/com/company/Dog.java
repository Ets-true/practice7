package com.company;

public abstract  class Dog {

    protected int age;
    protected String name;

    Dog() {
       age = 0;
       name = "noname";
    }

    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
