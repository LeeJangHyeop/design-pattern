package patterns.creational.factorymethod.second.product;

public class ChinessKimchi extends Kimchi {
    public ChinessKimchi() {
        this.name = "중국 김치";
        this.cabbage = "중국산 배추";
        this.pepperPowder = "중국산 고추가루";
        this.salt = "중국산 소금";

        topping.add("중국 부추");
        topping.add("중국 갈치");
    }
}
