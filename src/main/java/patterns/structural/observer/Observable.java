package patterns.structural.observer;

public interface Observable {
    void notifySubscribers();
    void setChanged();
    void subscribe(Observer o);
    void unsubscribe(Observer o);
}
