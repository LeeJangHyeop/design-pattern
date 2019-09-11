package patterns.creational.factorymethod.second.product;

import java.util.ArrayList;

public abstract class Kimchi {

    String name;
    String cabbage;
    String pepperPowder;
    String salt;

    ArrayList topping = new ArrayList();

    public String getName() {
        return name;
    }

    public void make() {
        System.out.println("Preparing : " + name);
        wash();
        cut();
        seasoning();
        spray();
    }

    void wash() {
        System.out.println("Washing " + cabbage + "...");

    }

    void cut() {
        System.out.println("Cutting " + cabbage + "...");
    }

    void seasoning() {
        System.out.println("Seasoning " + pepperPowder + " with " + salt + "...");
    }

    void spray() {
        for(int i=0;i<topping.size();i++) {
            System.out.println("Spray " + topping.get(i));
        }
    }
}
