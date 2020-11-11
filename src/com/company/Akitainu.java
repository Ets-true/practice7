package com.company;

public class Akitainu  extends  Dog {

    protected String expectation;

    Akitainu(){
        expectation = "short";
    }

    Akitainu(int age, String name, String expectation){
        super(age, name);
        this.expectation = expectation;
    }

    @Override
    public String toString() {
        return "Akitainu{" +
                "expectation='" + expectation + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
