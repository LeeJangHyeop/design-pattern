package patterns.creational.abstractfactory.client;

import patterns.creational.abstractfactory.factory.CarFactory;
import patterns.creational.abstractfactory.product.Engine;
import patterns.creational.abstractfactory.product.Tire;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class CarClient {
    private Engine engine;
    private Tire tire;

    public CarClient(CarFactory carFactory) {
        this.engine = carFactory.createEngine();
        this.tire = carFactory.createTire();
    }

    public void trialRide() {
        System.out.println("Car client start trial ride");
        engine.move();
        tire.protect();
        System.out.println("Car client get out of a car");
    }
}
