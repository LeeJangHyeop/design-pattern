package pattern.factorymethod.creator;

import pattern.factorymethod.product.AirFilterProduction;
import pattern.factorymethod.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AirFilter extends Product {
    Production createProduction() {
        return new AirFilterProduction();
    }
}
