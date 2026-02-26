package com.corejava.oops.StaticDemo.FactoryDemo;

public class Sedan extends Car {
    @Override
    public void deliver() {
        System.out.printf(
            "Delivering a %s model %s brand %s and price %.2f%n",
            super.getName(), getModel(), getBrand(), getPrice()
        );
    }

}
