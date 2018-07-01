package pattern.abstractfactory.factory;

import pattern.abstractfactory.product.AudiEngine;
import pattern.abstractfactory.product.AudiTire;
import pattern.abstractfactory.product.Engine;
import pattern.abstractfactory.product.Tire;

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
