package pt.utad.mei.aps;

public class Main {
    private static void problem1() {
        Car car1 = new Car("Ford", "Fiesta", 50);
        Car car2 = new Car("Audi", "A3", 60);
        Car car3 = new Car("BMW", "X5", 70);

        car1.fillTank(40);
        car2.fillTank(50);
        car3.fillTank(60);

        car1.fillTank(20);
        car2.fillTank(10);
        car3.fillTank(10);
    }

    private static void problem2() {
        var timesAdapter = new TimesAdapter(new Times());
        System.out.println(timesAdapter.multiply(2, 3));

        var multiplyAdapter = new MultiplyAdapter(new Multiply());
        System.out.println(multiplyAdapter.multiply(2, 3));
    }

    public static void main(String[] args) {
        problem1();
        System.out.println();
        problem2();
    }
}