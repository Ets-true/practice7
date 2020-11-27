package com.company.dish;

public abstract class Dish {

        protected String material;
        protected boolean purity;


        public Dish(){
            material = "unknown";
            purity = false;
        }

        public Dish(String material, boolean purity){
        this.material = material;
        this.purity = purity;
}

    @Override
    public String toString() {
        return "Dish{" + "material='" + material + '\'' + ", purity=" + purity + '}';
    }
    public void clean(){
            purity = true;
    }

}
