package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.product.AudiEngine;
import patterns.creational.abstractfactory.product.AudiTire;
import patterns.creational.abstractfactory.product.Engine;
import patterns.creational.abstractfactory.product.Tire;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AudiCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Tire createTire() {
        return new AudiTire();
    }
}
