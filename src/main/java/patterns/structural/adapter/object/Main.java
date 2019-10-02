package patterns.structural.adapter.object;

public class Main {
    public static void main(String[] args) {
        FirstBusinessLogic firstBusinessLogic = new FirstBusinessLogic();
        firstBusinessLogic.difficultLogic();

        System.out.println();

        SomeBusinessLogic someBusinessLogic = new SomeBusinessLogic();
        someBusinessLogic.logic();

        System.out.println();

        Adaptee adaptee = new Adaptee(someBusinessLogic);
        adaptee.run();

        System.out.println();

        // can't this case
        // adaptee.setOtherBusinessLogic(firstBusinessLogic);

        OtherBusinessLogicAdapter otherBusinessLogicAdapter = new OtherBusinessLogicAdapter(firstBusinessLogic);

        // but this case
        adaptee.setOtherBusinessLogic(otherBusinessLogicAdapter);
        adaptee.run();
    }
}
