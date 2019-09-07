package patterns.structural.decorator;

public class MapleSyrup extends OptionalBeverageDecorator {

    private final int cost = 300;

    private final String name = "메이플 시럽";

    public MapleSyrup(Beverage beverage) {
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
