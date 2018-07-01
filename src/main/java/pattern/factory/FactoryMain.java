package pattern.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class FactoryMain {

    private static Production production;

    public static void main(String[] args) {
        initialize();
        production.produce();
    }

    static void initialize() {
        // Client pick a factory type
        String productString = orderRandomProduct();

        if("AirFilter".equals(productString)) {
            production = new AirFilterProduction();
        }

        else if("BagFilter".equals(productString)) {
            production = new BagFilterProduction();
        }
        else {
            System.out.println("Error!!!");
            return;
        }
    }

    static String orderRandomProduct() {
        Random rnd = new Random();
        List<String> productList = new ArrayList<>();
        productList.add("AirFilter");
        productList.add("BagFilter");

        return productList.get(rnd.nextInt(2));
    }
}
