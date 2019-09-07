package factory.abstr;

import factory.Bmw;
import factory.Car;
import factory.method.Factory;

public class BmwFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
