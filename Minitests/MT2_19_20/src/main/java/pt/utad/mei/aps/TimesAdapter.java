package pt.utad.mei.aps;

public class TimesAdapter implements Multiplication {
    private final Times times;

    public TimesAdapter(Times times) {
        this.times = times;
    }

    @Override
    public int multiply(int a, int b) {
        return times.doIt(a, b);
    }
}
