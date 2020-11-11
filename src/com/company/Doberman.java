package com.company;

public class Doberman extends Dog {

    protected  String toothSize;


    Doberman(){
        toothSize = "small";
    }

    Doberman(int age, String name, String toothSize){
        super( age, name);
        this.toothSize = toothSize;
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "toothSize='" + toothSize + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

