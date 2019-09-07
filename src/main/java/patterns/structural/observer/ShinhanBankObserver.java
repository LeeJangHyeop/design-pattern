package patterns.structural.observer;

public class ShinhanBankObserver implements Observer {
    @Override
    public void update(String name, long amount) {
        System.out.println("ShinhanBank Data updated, name : " + name + ", amount : " + amount);
    }
}
