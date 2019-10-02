package patterns.structural.adapter.object;

public class OtherBusinessLogicAdapter implements OtherBusinessLogic {

    private MyBusinessLogic myBusinessLogic;

    public OtherBusinessLogicAdapter(MyBusinessLogic myBusinessLogic) {
        this.myBusinessLogic = myBusinessLogic;
    }

    @Override
    public void logic() {
        System.out.println("Adapter applied.");
        myBusinessLogic.difficultLogic();
    }
}
