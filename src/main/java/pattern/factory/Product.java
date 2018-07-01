package pattern.factory;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
abstract public class Product {
    public Product() {
        Production production = createProduction();
    }

    abstract Production createProduction();
}
