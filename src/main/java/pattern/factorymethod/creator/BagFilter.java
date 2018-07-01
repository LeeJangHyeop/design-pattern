package pattern.factorymethod.creator;

import pattern.factorymethod.product.BagFilterProduction;
import pattern.factorymethod.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class BagFilter extends Product {
    Production createProduction() {
        return new BagFilterProduction();
    }
}
