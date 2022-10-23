package pt.utad.mei.aps;

public class Database extends Storage {
    public Database(long capacity) {
        super(capacity);
    }

    @Override
    public String toString() {
        return "Database: %d bytes".formatted(this.getCapacity());
    }
}
