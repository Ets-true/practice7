package com.company.dog;

public abstract  class Dog {

    protected int age;
    protected String name;

    public Dog() {
       age = 0;
       name = "name";
    }

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

}
