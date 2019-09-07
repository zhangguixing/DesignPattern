package factory.simple;

import factory.Car;

public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Car bmw = factory.getCar("Bmw");
        bmw.show();
    }
}
