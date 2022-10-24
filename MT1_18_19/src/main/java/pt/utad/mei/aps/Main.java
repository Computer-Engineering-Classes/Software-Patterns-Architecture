package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var builder = new BikeBuilder();
        var director = new Director(builder);

        director.make(BikeType.SPEEDSTER);
        var bike = builder.getResult();
        bike.details();

        director.make(BikeType.FAST);
        var bike2 = builder.getResult();
        bike2.details();

        director.make(BikeType.SLOW);
        var bike3 = builder.getResult();
        bike3.details();
    }
}