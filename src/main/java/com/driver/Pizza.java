package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){

            this.price= 300;
            System.out.println("Base Price Of The Pizza:"+price);
        }
        else{
            this.price=400;
            System.out.println("Base Price Of The Pizza:"+price);
        }


    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getPrice(){


        return this.price;
    }


boolean extrac = false;
    public void addExtraCheese(){
        // your code goes here
        if(extrac == false)
        this.price+=80;
        System.out.println("Extra Cheese Added: 80");
extrac = true;
        }


boolean ones= false;
    public void addExtraToppings(){
        // your code goes here

            if (this.isVeg == true && extrac == true && ones == false) {
                System.out.println("Extra Toppings Added: 70");
                this.price += 70;
            } else if (this.isVeg == false && extrac == true && ones== false) {
                System.out.println("Extra Toppings Added:120");
                this.price += 120;
            }

ones = true;
    }

    public void addTakeaway(){
        // your code goes here
        System.out.println("Paperbag Added: 20");
        this.price+=20;
    }

    public String getBill(){
        // your code goes here

        String s = String.valueOf(this.price);

       return s;
    }
}
