package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var diagram = new Diagram();

        var line = new Line(11.0);
        var circle = new Circle(5.0);
        var triangle = new Triangle(3.0, 4.0);
        var line2 = new Line(7.0);

        diagram.add(line);
        diagram.add(circle);
        diagram.add(triangle);
        diagram.add(line2);

        var objects = diagram.getObjects();
        for (var object : objects) {
            System.out.println("Object: " + object);
        }

        diagram.remove(line2);
        diagram.draw("red");
    }
}