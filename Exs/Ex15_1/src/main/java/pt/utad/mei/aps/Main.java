package pt.utad.mei.aps;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var dispenser = new ChangeDispenser(2.0);
        var dispenser2 = new ChangeDispenser(1.0);
        var dispenser3 = new ChangeDispenser(0.5);
        var dispenser4 = new ChangeDispenser(0.2);
        var dispenser5 = new ChangeDispenser(0.1);
        var dispenser6 = new ChangeDispenser(0.05);
        var dispenser7 = new ChangeDispenser(0.02);
        var dispenser8 = new ChangeDispenser(0.01);

        dispenser.setNext(dispenser2);
        dispenser2.setNext(dispenser3);
        dispenser3.setNext(dispenser4);
        dispenser4.setNext(dispenser5);
        dispenser5.setNext(dispenser6);
        dispenser6.setNext(dispenser7);
        dispenser7.setNext(dispenser8);

        var value = BigDecimal.valueOf(13.56);
        dispenser.change(value);
    }
}