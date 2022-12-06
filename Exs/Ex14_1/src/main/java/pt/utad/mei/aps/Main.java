package pt.utad.mei.aps;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var circles = new Circle[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            double x = random.nextDouble(10) - 5;
            double y = random.nextDouble(10) - 5;
            double radius = random.nextDouble(2);
            int colorIndex = random.nextInt(ColorName.values().length);
            var colorName = ColorName.values()[colorIndex];
            circles[i] = new Circle(x, y, radius, colorName);
        }

        for (Circle circle : circles) {
            System.out.println(circle);
            System.out.println("Area: " + circle.area());
            System.out.println("Perimeter: " + circle.perimeter());
            System.out.println();
        }
    }
}