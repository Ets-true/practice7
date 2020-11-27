package com.company.dish;

public class Spoon extends Dish {

    protected String size;

    public Spoon(){
        size = "little";
    }
    public Spoon(String material, boolean purity, String size){
        super(material, purity);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Spoon{" + "size='" + size + '\'' + ", material='" + material + '\'' + ", purity=" + purity + '}';
    }
}
