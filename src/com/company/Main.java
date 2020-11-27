package com.company;

import com.company.dish.Plate;
import com.company.dish.Spoon;
import com.company.dish.Dish;


import com.company.dog.Dog;
import com.company.dog.Haski;
import com.company.dog.Bulldog;

import com.company.furniture.Chair;
import com.company.furniture.Table;
import com.company.furniture.Furniture;
import com.company.furniture.FurnitureShop;


public class Main {

    public static void main(String[] args) {

	    Plate plate = new Plate("plastic", true, "middle");
	    Spoon spoon = new Spoon("steel", false, "usual");

        System.out.println(plate);
        System.out.println(spoon);
        spoon.clean();
        System.out.println(spoon);

        Bulldog bulldog = new Bulldog(8, "Rassel", "high");
        Haski haski = new Haski(10, "Haski","pretty");
        System.out.println(bulldog);
        System.out.println(haski);

        Table table = new Table("high","ergonomic", 100 , 150);
        Chair chair = new Chair("low","classic", 40, 55);
        System.out.println(table);
        System.out.println(chair);

        FurnitureShop furnitureShop = new FurnitureShop();
        System.out.println(furnitureShop.calculateAmount());
        furnitureShop.addToCart(chair);
        furnitureShop.addToCart(table);
        System.out.println(furnitureShop.calculateAmount());


    }
}
