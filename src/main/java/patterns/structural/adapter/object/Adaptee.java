package patterns.structural.adapter.object;

public class Adaptee {

    private OtherBusinessLogic otherBusinessLogic;

    public Adaptee(OtherBusinessLogic otherBusinessLogic) {
        this.otherBusinessLogic = otherBusinessLogic;
    }

    public void setOtherBusinessLogic(OtherBusinessLogic otherBusinessLogic) {
        this.otherBusinessLogic = otherBusinessLogic;
    }

    public void run() {
        System.out.println("This adaptee only allow to OtherBusinessLogic");
        this.otherBusinessLogic.logic();
    }
}
