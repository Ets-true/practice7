package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	Plate plate = new Plate("ceramics", true, "middle");
	Spoon spoon = new Spoon("steel", false, "big");
        System.out.println(plate);
        System.out.println(spoon);
        spoon.clean();
        System.out.println(spoon);
        Doberman doberman = new Doberman(8, "Strike", "big");
        Akitainu akitainu = new Akitainu(10, "Hatiko","forever");
        System.out.println(doberman);
        System.out.println(akitainu);
        Table table = new Table("enough","hi-tech", 150 , 24);
        Chair chair = new Chair("bad","barocco", 70, 10);
        System.out.println(table);
        System.out.println(chair);
        FurnitureShop furnitureShop = new FurnitureShop();
        System.out.println(furnitureShop.calculateAmount());
        furnitureShop.addToCart(chair);
        furnitureShop.addToCart(table);
        System.out.println(furnitureShop.calculateAmount());


    }
}
