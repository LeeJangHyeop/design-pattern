package patterns.creational.factorymethod.second.creator;

import patterns.creational.factorymethod.second.product.Kimchi;
import patterns.creational.factorymethod.second.product.KoreanGgagdugiKimchi;
import patterns.creational.factorymethod.second.product.KoreanKimchi;

public class KoreanKimchiFactory extends KimchiFactory {
    @Override
    Kimchi createKimchi(String type) {
        switch (type) {
            case "배추김치":
                return new KoreanKimchi();
            case "깍두기":
                return new KoreanGgagdugiKimchi();
            default:
                return null;
        }
    }
}
