package factory.method;

import factory.Audi;
import factory.Car;

public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
