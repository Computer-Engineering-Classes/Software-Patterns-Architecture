package pt.utad.mei.aps;

public class Cloud extends Storage {
    public Cloud(long capacity) {
        super(capacity);
    }

    @Override
    public String toString() {
        return "Cloud: %d bytes".formatted(this.getCapacity());
    }
}
