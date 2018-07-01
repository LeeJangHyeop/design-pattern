package pattern.abstractfactory.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class HyundaiTire implements Tire {
    @Override
    public void protect() {
        System.out.println(this.getClass().getSimpleName() + " is protecting to wheel");
    }
}
