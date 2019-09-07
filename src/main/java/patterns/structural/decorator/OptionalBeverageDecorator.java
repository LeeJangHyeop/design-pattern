package patterns.structural.decorator;

public abstract class OptionalBeverageDecorator extends Beverage {

    protected final Beverage beverage;

    public OptionalBeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected BeverageSize getSize() {
        System.out.println("From " + this.getClass());
        return beverage.getSize();
    }
}
