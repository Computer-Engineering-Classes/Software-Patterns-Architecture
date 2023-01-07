package pt.utad.mei.aps;

import java.util.ArrayList;

public class Car {
    private final String color;
    private final String model;
    private final double maxSpeed;
    private final ArrayList<CarObserver> observers;
    private double currentSpeed;


    public Car(String color, String model, double maxSpeed) {
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.observers = new ArrayList<>();
    }

    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (CarObserver observer : observers) {
            observer.update(message);
        }
    }

    public void turnOn() {
        System.out.println("Car is on");
    }

    public void turnOff() {
        System.out.println("Car is off");
    }

    public void accelerate(double speed) {
        if (speed > maxSpeed) {
            notifyObservers("Speed is too high");
        } else {
            currentSpeed = speed;
            notifyObservers("Speed is " + currentSpeed);
        }
    }

    public void brake() {
        currentSpeed = 0;
        notifyObservers("Speed is " + currentSpeed);
    }

    public CarGear getGear() {
        if (currentSpeed == 0) {
            return CarGear.PARK;
        } else if (currentSpeed < 10) {
            return CarGear.REVERSE;
        } else if (currentSpeed < 40) {
            return CarGear.NEUTRAL;
        } else if (currentSpeed < 60) {
            return CarGear.FIRST;
        } else if (currentSpeed < 90) {
            return CarGear.SECOND;
        } else {
            return CarGear.THIRD;
        }
    }

    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Current speed: " + currentSpeed);
    }
}
