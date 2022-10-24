package pt.utad.mei.aps;

public class Director {
    private final BikeBuilder bikeBuilder;

    public Director(BikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public void make(BikeType bikeType) {
        switch (bikeType) {
            case SPEEDSTER -> constructSpeedster();
            case FAST -> constructFast();
            case SLOW -> constructSlow();
        }
    }

    private void constructSpeedster() {
        bikeBuilder.setBikeType(BikeType.SPEEDSTER)
                .addFrame("XXL")
                .addMotor("120hp")
                .addWheels("18in")
                .addSuspension("105mm");
    }

    private void constructFast() {
        bikeBuilder.setBikeType(BikeType.FAST)
                .addFrame("L")
                .addMotor("100hp")
                .addWheels("14in")
                .addSuspension("90mm");
    }

    private void constructSlow() {
        bikeBuilder.setBikeType(BikeType.SLOW)
                .addFrame("S")
                .addMotor("75hp")
                .addSuspension("70mm")
                .addWheels("12in");
    }
}
