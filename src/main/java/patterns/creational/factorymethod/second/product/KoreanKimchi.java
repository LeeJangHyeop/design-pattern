package patterns.creational.factorymethod.second.product;

public class KoreanKimchi extends Kimchi {
    public KoreanKimchi() {
        this.name = "한국 김치";
        this.cabbage = "배추";
        this.pepperPowder = "한국산 고추가루";
        this.salt = "천일염";

        topping.add("부추");
        topping.add("갈치");
    }
}
