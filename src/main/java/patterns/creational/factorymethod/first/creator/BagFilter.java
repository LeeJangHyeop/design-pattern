package patterns.creational.factorymethod.first.creator;

import patterns.creational.factorymethod.first.product.BagFilterProduction;
import patterns.creational.factorymethod.first.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class BagFilter extends Product {
    Production createProduction() {
        return new BagFilterProduction();
    }
}
