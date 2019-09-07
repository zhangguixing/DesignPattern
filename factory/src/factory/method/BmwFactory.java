package factory.method;

import factory.Bmw;
import factory.Car;

public class BmwFactory implements Factory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
