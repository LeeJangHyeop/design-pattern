package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.product.Engine;
import patterns.creational.abstractfactory.product.Tire;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public interface CarFactory {
    Engine createEngine();
    Tire createTire();
}
