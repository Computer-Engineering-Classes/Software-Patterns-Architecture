package pt.mei.utad.aps;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        var gadgets = new ArrayList<Gadget>();

        var g1 = new BlueGadget(0, 0);
        var g2 = new RedGadget(2, 5);
        var g3 = new GreenGadget(7, -4);

        gadgets.add(g1);
        gadgets.add(g2);
        gadgets.add(g3);

        for (var gadget: gadgets) {
            gadget.details();
            System.out.println("Prize: " + gadget.getPrize());
            gadget.move();
            gadget.destroy();
            System.out.print("\n");
        }

        var gadgetsCopy = new ArrayList<Gadget>();
        for (var gadget : gadgets) {
            gadgetsCopy.add(gadget.clone());
        }

        gadgets.add(g1);
        gadgetsCopy.add(g1.clone());
        gadgets.add(g2);
        gadgetsCopy.add(g2);

        for (int i = 0; i < gadgets.size(); i++) {
            if (gadgets.get(i) == gadgetsCopy.get(i)) {
                System.out.println(i + " Same object.");
            }
            else {
                System.out.println(i + " Not the same object.");
                if (gadgets.get(i).equals(gadgetsCopy.get(i)))
                {
                    System.out.println(i + " Equal objects.");
                }
                else {
                    System.out.println(i + " Not equal objects.");
                }
            }
        }
    }
}