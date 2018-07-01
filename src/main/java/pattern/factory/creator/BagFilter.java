package pattern.factory.creator;

import pattern.factory.product.BagFilterProduction;
import pattern.factory.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class BagFilter extends Product {
    Production createProduction() {
        return new BagFilterProduction();
    }
}
