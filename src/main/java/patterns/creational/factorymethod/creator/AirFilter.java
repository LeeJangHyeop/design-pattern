package patterns.creational.factorymethod.creator;

import patterns.creational.factorymethod.product.AirFilterProduction;
import patterns.creational.factorymethod.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AirFilter extends Product {
    Production createProduction() {
        return new AirFilterProduction();
    }
}
