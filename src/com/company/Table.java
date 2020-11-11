package com.company;

public class Table extends Furniture {

    protected  int height;

    Table(){
        height = 0;
        price = 15;
    }
    Table( String strength, String style, int height, long price){
        super(strength,style, price);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", strength='" + strength + '\'' +
                ", style='" + style + '\'' +
                ", price=" + price +
                '}';
    }
}
