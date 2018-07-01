package pattern.abstractfactory.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AudiEngine implements Engine {
    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " is motivating to car.");
    }
}
