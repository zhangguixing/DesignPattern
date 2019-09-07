package factory.abstr;

import factory.Benz;
import factory.Car;
import factory.method.Factory;

public class BenzFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
