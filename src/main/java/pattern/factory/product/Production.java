package pattern.factory.product;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public interface Production {
    default void produce() {
        useStock();
        make();
        store();
    }
    void make();
    void useStock();
    void store();
}
