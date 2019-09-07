package patterns.structural.observer;

public class ObserverMain {
    public static void main(String[] args) {
        WooriBankObserver wooriBankObserver = new WooriBankObserver();

        ShinhanBankObserver shinhanBankObserver = new ShinhanBankObserver();

        DataCenter dataCenter = new DataCenter();

        dataCenter.subscribe(wooriBankObserver);
        dataCenter.subscribe(shinhanBankObserver);

        dataCenter.setData("이장협", 10000);
        dataCenter.setData("이장협", 20000);

        dataCenter.unsubscribe(wooriBankObserver);
        dataCenter.setData("이장협", 30000);
    }
}
