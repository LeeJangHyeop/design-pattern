package patterns.structural.adapter.object;

public class FirstBusinessLogic implements MyBusinessLogic {
    @Override
    public void difficultLogic() {
        System.out.println("This logic is so difficult.");
    }
}
