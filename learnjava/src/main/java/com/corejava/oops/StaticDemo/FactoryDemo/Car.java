package com.corejava.oops.StaticDemo.FactoryDemo;
public abstract class Car {

        private String name;
        private String model;
        private String brand;
        private float price;

        public String getName() {
                return name;
        }

        public String getModel() {
                return model;
        }

        public String getBrand() {
                return brand;
        }

        public float getPrice() {
                return price;
        }

        public void deliver() {}
}


