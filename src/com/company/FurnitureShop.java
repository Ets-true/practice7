package com.company;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {

      private List<Furniture> cart;

      public  FurnitureShop(){
          cart = new ArrayList<>();
      }

     public  long calculateAmount(){
         return cart.stream().mapToLong(Furniture::getPrice).sum();
     }

     public void addToCart(Furniture furniture){
          cart.add(furniture);
      }

      public void eraseCart(){
          cart.clear();
      }

    public List<Furniture> getCart() {
        return cart;
    }
}
