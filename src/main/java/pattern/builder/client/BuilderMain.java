package pattern.builder.client;

import pattern.builder.builder.AirFilterBuilder;
import pattern.builder.builder.BagFilterBuilder;
import pattern.builder.product.Product;

/**
 * Created by LeeJangHyeop on 2018. 7. 3..
 */
public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();

        AirFilterBuilder airFilterBuilder = new AirFilterBuilder();
        director.constructAirFilter(airFilterBuilder);

        Product product1 = airFilterBuilder.build();
        System.out.println("Product : " + product1);

        BagFilterBuilder bagFilterBuilder = new BagFilterBuilder();
        director.constructBagFilter(bagFilterBuilder);

        Product product2 = bagFilterBuilder.build();
        System.out.println("Product : " + product2);
    }
}
