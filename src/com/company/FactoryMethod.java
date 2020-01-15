package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactoryMethod {

    public static void main(String[] args) {
        System.out.println("Enter car name: ");
        String carName = new Scanner(System.in).nextLine();

        Car car = factoryMethod(carName);
        car.ride();
    }

    //          bean name   Bean
    static Map<String,      Car> applicationContext = new HashMap<>();
    static {
        applicationContext.put("personService", new Honda());
        applicationContext.put("seat", new Seat());
    }


    public static Car factoryMethod(String car) {
        return applicationContext.get(car);


//        switch (car) {
//            //30+
//            case "honda":
//                return new Honda();
//
//            default:
//                return new Seat();
//        }
    }
}


abstract class Car {
    abstract void ride();
}

//PersonServiceImpl
class Honda extends Car {
    @Override
    void ride() {
        System.out.println("Honda ride");
    }
}

class Seat extends Car {

    @Override
    void ride() {
        System.out.println("Seat ride");
    }
}


interface MainInterface {

    //Data member
    Interface2 getInterface2();
}

interface Interface2 {
    //interface ... .... ...
}