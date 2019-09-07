package factory.abstr;

import factory.Car;

/**
 * 抽象工厂模式，默认为 宝马
 */
public class DefaultFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new BmwFactory().getCar();
    }
}
