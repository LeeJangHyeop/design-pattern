package patterns.structural.decorator;

public class DefaultCoffee extends Beverage {

    private final int cost = 500;

    private final  String name = "기본 커피";

    private BeverageSize beverageSize;

    public DefaultCoffee(BeverageSize beverageSize) {
        this.beverageSize = beverageSize;
    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String description() {
        return name + " (" + beverageSize.name() + ")";
    }

    @Override
    protected BeverageSize getSize() {
        return beverageSize;
    }
}
