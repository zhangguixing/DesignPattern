package factory.method;

import factory.Benz;
import factory.Car;

public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
