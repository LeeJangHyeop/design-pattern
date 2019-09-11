package patterns.creational.factorymethod.first.creator;

import patterns.creational.factorymethod.first.product.AirFilterProduction;
import patterns.creational.factorymethod.first.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AirFilter extends Product {
    Production createProduction() {
        return new AirFilterProduction();
    }
}
