package pt.utad.mei.aps;

import java.util.ArrayList;

public class CarTank {
    private float capacity;
    private float currentLevel;
    private Boolean isFull;
    private ArrayList<CarTankObserver> observers;

    public CarTank(float capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
        this.observers = new ArrayList<>();
    }

    public void addObserver(CarTankObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(CarTankObserver observer) {
        this.observers.remove(observer);
    }

    public void fill(float amount) {
        if (this.currentLevel + amount >= this.capacity) {
            this.currentLevel = this.capacity;
            this.isFull = true;
            this.notifyObservers("The tank is full!");
        } else {
            this.currentLevel += amount;
            this.isFull = false;
        }
    }

    private void notifyObservers(String message) {
        for (CarTankObserver observer : this.observers) {
            observer.update(message);
        }
    }
}
