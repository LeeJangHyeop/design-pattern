package pattern.factorymethod.creator;

import pattern.factorymethod.product.Production;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
abstract public class Product {

    public void production() {
        System.out.println(this.getClass().getSimpleName() + " is being created...");
        Production production = createProduction();
        production.produce();
        System.out.println(this.getClass().getSimpleName() + " is created complete!");
    }

    abstract Production createProduction();
}
