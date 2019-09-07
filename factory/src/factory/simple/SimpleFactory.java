package factory.simple;

import factory.Audi;
import factory.Benz;
import factory.Bmw;
import factory.Car;

/**
 * 简单工厂模式
 */
import java.util.NoSuchElementException;

public class SimpleFactory {
    public Car getCar(String name){
        if("Bmw".equals(name)){
            return new Bmw();
        }else if("Benz".equals(name)){
            return new Benz();
        }else if ("Audi".equals(name)){
            return new Audi();
        }else {
            throw new NoSuchElementException("未找到"+name+"相关产品！");
        }
    }
}
