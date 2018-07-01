package pattern.factory;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class BagFilter extends Product {
    Production createProduction() {
        return new BagFilterProduction();
    }
}
