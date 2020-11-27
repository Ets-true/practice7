package com.company.dog;

public class Bulldog extends Dog {

    protected  String aggressiveness;


    public Bulldog(){
        aggressiveness = "high";
    }

    public Bulldog(int age, String name, String aggressiveness){
        super( age, name);
        this.aggressiveness = aggressiveness;
    }

    @Override
    public String toString() {
        return "Bulldog{" + "aggressiveness='" + aggressiveness + '\'' + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}

