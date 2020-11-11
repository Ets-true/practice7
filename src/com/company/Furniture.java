package com.company;

public  abstract class Furniture {

    protected String strength;
    protected String style;
    protected long price;

    Furniture(){
        strength = "low";
        style = "undefined";
        price = 1;
    }
    Furniture(String strength, String style, long price){
        this.strength = strength;
        this.style = style;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "strength='" + strength + '\'' +
                ", style='" + style + '\'' +
                ", price=" + price +
                '}';
    }

    public long getPrice(){
        return price;
    }

}
