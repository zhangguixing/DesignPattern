package factory.abstr;

import factory.Car;

public class Main {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        Car car = defaultFactory.getCar();
        car.show();

        Car benz = defaultFactory.getCar("Benz");
        benz.show();
    }
}
