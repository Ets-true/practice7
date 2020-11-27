package com.company.furniture;

import com.company.furniture.Furniture;

public class Chair  extends Furniture {

    protected  int heightBack;

    public Chair(){
        heightBack = 0;
        price = 20;
    }

    public Chair(String strength,String style, int heightBack, long price){
        super(strength, style, price);
        this.heightBack = heightBack;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "heightBack=" + heightBack +
                ", strength='" + strength + '\'' +
                ", style='" + style + '\'' +
                ", price=" + price +
                '}';
    }
}
