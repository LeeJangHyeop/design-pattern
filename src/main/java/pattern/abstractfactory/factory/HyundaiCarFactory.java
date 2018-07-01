package pattern.abstractfactory.factory;

import pattern.abstractfactory.product.Engine;
import pattern.abstractfactory.product.HyundaiEngine;
import pattern.abstractfactory.product.HyundaiTire;
import pattern.abstractfactory.product.Tire;

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
