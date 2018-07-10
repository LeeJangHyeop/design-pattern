package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.product.Engine;
import patterns.creational.abstractfactory.product.HyundaiEngine;
import patterns.creational.abstractfactory.product.HyundaiTire;
import patterns.creational.abstractfactory.product.Tire;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class HyundaiCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new HyundaiEngine();
    }

    @Override
    public Tire createTire() {
        return new HyundaiTire();
    }
}
