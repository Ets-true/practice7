package com.company;

public class Spoon extends Dish {

    protected String size;

    Spoon(){
        size = "little";
    }
    Spoon(String material, boolean purity, String size){
        super(material, purity);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", purity=" + purity +
                '}';
    }
}
