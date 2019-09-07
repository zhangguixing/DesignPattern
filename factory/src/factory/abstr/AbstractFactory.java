package factory.abstr;

import factory.Car;

import java.util.NoSuchElementException;

/**
 * 抽象工厂模式
 */

public abstract class AbstractFactory {
    protected abstract Car getCar();
    protected Car getCar(String name){
        if("Bmw".equals(name)){
            return new BmwFactory().getCar();
        }else if("Benz".equals(name)){
            return new BenzFactory().getCar();
        }else if ("Audi".equals(name)){
            return new AudiFactory().getCar();
        }else {
            throw new NoSuchElementException("未找到"+name+"相关产品！");
        }
    }
}
