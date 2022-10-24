package pt.utad.mei.aps;

public class Q4D {
    private final Double flt;
    private final String s;

    public Q4D() {
        this.flt = 77.0;
        this.s = "myClass";
    }

    public Double getFlt() {
        return this.flt;
    }

    public String getS() {
        return this.s;
    }

    public Double getA() {
        return this.flt * this.flt;
    }
}
