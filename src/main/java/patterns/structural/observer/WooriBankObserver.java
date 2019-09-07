package patterns.structural.observer;

public class WooriBankObserver implements Observer {
    @Override
    public void update(String name, long amount) {
        System.out.println("WooriBank Data updated, name : " + name + ", amount : " + amount);
    }
}
