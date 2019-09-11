package patterns.creational.factorymethod.second.creator;

import patterns.creational.factorymethod.second.product.ChinessKimchi;
import patterns.creational.factorymethod.second.product.Kimchi;

public class ChinessKimchiFactory extends KimchiFactory {
    @Override
    Kimchi createKimchi(String type) {
        switch (type) {
            case "배추김치":
                return new ChinessKimchi();
            default:
                return null;
        }
    }
}
