package pt.utad.mei.aps;

public class MultiplyAdapter implements Multiplication {
    private final Multiply multiply;

    public MultiplyAdapter(Multiply multiply) {
        this.multiply = multiply;
    }

    @Override
    public int multiply(int a, int b) {
        return (int) multiply.multiply(a, b);
    }
}
