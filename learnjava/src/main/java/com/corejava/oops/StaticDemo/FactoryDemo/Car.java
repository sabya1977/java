package com.corejava.oops.StaticDemo.FactoryDemo;
public abstract class Car {

        private String make;
        private String model;
        int year;

        public String getMake() {
                return make;
        }

        public String getModel() {
                return model;
        }

        public int getyear() {
                return year;
        }

        public abstract void deliver();
}


