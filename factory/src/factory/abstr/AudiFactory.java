package factory.abstr;

import factory.Audi;
import factory.Car;
import factory.method.Factory;

public class AudiFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
