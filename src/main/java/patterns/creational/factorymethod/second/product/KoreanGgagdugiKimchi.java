package patterns.creational.factorymethod.second.product;

public class KoreanGgagdugiKimchi extends  Kimchi {
    public KoreanGgagdugiKimchi() {
        this.name = "깍두기";
        this.cabbage = "무";
        this.pepperPowder = "한국산 고추가루";
        this.salt = "천일염";

        topping.add("오징어 젓갈");
        topping.add("양파");
    }
}
