package patterns.structural.adapter.object;

public class SomeBusinessLogic implements OtherBusinessLogic{
    @Override
    public void logic() {
        System.out.println("This is some business logic.");
    }
}
