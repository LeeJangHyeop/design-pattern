package patterns.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class DataCenter implements Observable {
    private String name;
    private long amount;

    private boolean isChanged = false;

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void notifySubscribers() {
        if(!isChanged)  return;
        subscribers
                .stream()
                .parallel()
                .forEach(o -> o.update(this.name, this.amount));
    }

    @Override
    public void setChanged() {
        this.isChanged = true;
    }

    @Override
    public void subscribe(Observer o) {
        System.out.println("subscribed");
        subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        int index = subscribers.indexOf(o);
        if(index >= 0)  subscribers.remove(index);
        System.out.println("unsubscribed");
    }

    public void setData(String name, long amount) {
        this.name = name;
        this.amount = amount;

        setChanged();
        notifySubscribers();
    }
}
