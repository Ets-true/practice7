package com.company;

public class Plate extends Dish {

    protected String width;

    public Plate(){
        width = "small";
    }

    Plate(String material, boolean purity, String width){
        super(material, purity);
        this.width = width;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "width='" + width + '\'' +
                ", material='" + material + '\'' +
                ", purity=" + purity +
                '}';
    }
}
