package patterns.creational.factorymethod.creator;

import patterns.creational.factorymethod.product.BagFilterProduction;
import patterns.creational.factorymethod.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class BagFilter extends Product {
    Production createProduction() {
        return new BagFilterProduction();
    }
}
