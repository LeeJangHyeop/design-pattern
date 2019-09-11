package patterns.creational.factorymethod.second.creator;

import patterns.creational.factorymethod.second.product.Kimchi;

public abstract class KimchiFactory {
    public Kimchi makeKimchi(String type) {
        Kimchi kimchi;

        kimchi = createKimchi(type);

        kimchi.make();

        return kimchi;
    }

    abstract Kimchi createKimchi(String type);
}
