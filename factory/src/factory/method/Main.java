package factory.method;

import factory.Car;

public class Main {
    public static void main(String[] args) {
        Factory factory = new BmwFactory();
        Car car = factory.getCar();
        car.show();
    }
}
