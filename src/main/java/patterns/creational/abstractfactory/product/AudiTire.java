package patterns.creational.abstractfactory.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AudiTire implements Tire {
    @Override
    public void protect() {
        System.out.println(this.getClass().getSimpleName() + " is protecting to wheel");
    }
}
