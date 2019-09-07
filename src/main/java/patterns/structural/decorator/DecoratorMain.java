package patterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Beverage beverage = new DefaultCoffee(BeverageSize.TALL);

        beverage = new WhippingCream(beverage);

        beverage = new MapleSyrup(beverage);

        System.out.println("description : " + beverage.description() + ", cost : " + beverage.cost() + ", size : " + beverage.getSize());
    }
}
