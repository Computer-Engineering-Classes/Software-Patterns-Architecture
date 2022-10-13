package pt.utad.mei.aps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var shapes = new ArrayList<Shape>();
        var shapesCopy = new ArrayList<Shape>();

        var c1 = new Circle(15, 5, "Blue", 10);
        var c2 = new Circle(12, 11, "Red", 7);
        var r1 = new Rectangle(0, 0, "Black", 20, 30);

        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(new Rectangle(0, 0, "Green", 10, 15));

        for (var shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        shapes.add(c1);
        shapesCopy.add(c1.clone());
        shapes.add(c2);
        shapesCopy.add(c2);

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) == shapesCopy.get(i)) {
                System.out.println(i + " Same object.");
            }
            else {
                System.out.println(i + " Not the same object.");
                if (shapes.get(i).equals(shapesCopy.get(i)))
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