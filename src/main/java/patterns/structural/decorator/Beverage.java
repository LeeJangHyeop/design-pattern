package patterns.structural.decorator;

public abstract class Beverage {
    protected abstract int cost();
    protected abstract String description();
    protected abstract BeverageSize getSize();
}
