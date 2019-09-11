package patterns.creational.factorymethod.second.client;

import patterns.creational.factorymethod.second.creator.ChinessKimchiFactory;
import patterns.creational.factorymethod.second.creator.KoreanKimchiFactory;
import patterns.creational.factorymethod.second.product.Kimchi;

public class KimchiMain {
    public static void main(String[] args) {
        KoreanKimchiFactory kimchiFactory = new KoreanKimchiFactory();

        ChinessKimchiFactory chinessKimchiFactory = new ChinessKimchiFactory();

        Kimchi kimchi = kimchiFactory.makeKimchi("배추김치");
        System.out.println("kimchi is " + kimchi.getName());

        Kimchi kimchi2 = chinessKimchiFactory.makeKimchi("배추김치");
        System.out.println("kimchi is " + kimchi2.getName());
    }
}
