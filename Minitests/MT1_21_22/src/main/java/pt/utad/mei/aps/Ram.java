package pt.utad.mei.aps;

public class Ram extends Storage {

    public Ram(long capacity) {
        super(capacity);
    }

    @Override
    public String toString() {
        return "RAM: %d bytes".formatted(this.getCapacity());
    }
}
