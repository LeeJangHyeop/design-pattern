package pattern.factory.creator;

import pattern.factory.product.AirFilterProduction;
import pattern.factory.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AirFilter extends Product {
    Production createProduction() {
        return new AirFilterProduction();
    }
}
