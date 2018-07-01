package pattern.factory.client;

import pattern.factory.creator.AirFilter;
import pattern.factory.creator.BagFilter;
import pattern.factory.creator.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class FactoryMain {

    private static Product product;

    public static void main(String[] args) {
        initialize();
        runBusinessLogic();
    }

    static void initialize() {
        // Client pick a factory type
        String productString = orderRandomProduct();

        if("AirFilter".equals(productString)) {
            product = new AirFilter();
        }

        else if("BagFilter".equals(productString)) {
            product = new BagFilter();
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

    static void runBusinessLogic() {
        product.production();
    }
}
