package patterns.creational.factorymethod.first.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class BagFilterProduction implements Production {

    @Override
    public void make() {
        System.out.println(this.getClass().getSimpleName().toString() + " is  created");
    }

    public void useStock() {
        System.out.println(this.getClass().getSimpleName().toString() + " use stock");
    }

    @Override
    public void store() {
        System.out.println(this.getClass().getSimpleName().toString() + " is stored");
    }
}
