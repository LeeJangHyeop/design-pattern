package patterns.structural.decorator;

public class WhippingCream extends OptionalBeverageDecorator {

    private final int cost = 500;

    private String name = "휘핑 크림";

    public WhippingCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected int cost() {
        return super.beverage.cost() + this.cost;
    }

    @Override
    protected String description() {
        return super.beverage.description() + ", " + this.name;
    }
}
