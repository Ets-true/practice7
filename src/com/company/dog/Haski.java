package com.company.dog;

public class Haski extends Dog {

    public String beauty;

    public Haski(){
        beauty = "fantastic";
    }

    public Haski(int age, String name, String expectation){
        super(age, name);
        this.beauty = expectation;
    }

    @Override
    public String toString() {
        return "Haski{" + "beauty='" + beauty + '\'' + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}
