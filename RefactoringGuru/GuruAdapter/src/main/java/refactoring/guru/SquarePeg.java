package refactoring.guru;

public record SquarePeg(double width) {

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
