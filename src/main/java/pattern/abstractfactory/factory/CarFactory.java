package pattern.abstractfactory.factory;

import pattern.abstractfactory.product.Engine;
import pattern.abstractfactory.product.Tire;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public interface CarFactory {
    Engine createEngine();
    Tire createTire();
}
