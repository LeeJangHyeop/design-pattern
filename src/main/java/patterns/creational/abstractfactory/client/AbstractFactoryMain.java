package patterns.creational.abstractfactory.client;

import patterns.creational.abstractfactory.factory.AudiCarFactory;
import patterns.creational.abstractfactory.factory.CarFactory;
import patterns.creational.abstractfactory.factory.HyundaiCarFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by LeeJangHyeop on 2018. 7. 1..
 */
public class AbstractFactoryMain {
    static CarClient carClient;
    static CarFactory carFactory;

    public static void main(String[] args) {
        initialize();
        carClient.trialRide();
    }

    static void initialize() {
        // Client pick a car type
        String carString = orderRandomCar();

        if("Hyundai".equals(carString)) {
            carFactory = new HyundaiCarFactory();
        }

        else if("Audi".equals(carString)) {
            carFactory = new AudiCarFactory();
        }
        else {
            System.out.println("Error!!!");
            return;
        }
        carClient = new CarClient(carFactory);
    }

    static String orderRandomCar() {
        Random rnd = new Random();
        List<String> productList = new ArrayList<>();
        productList.add("Hyundai");
        productList.add("Audi");

        return productList.get(rnd.nextInt(2));
    }
}
