package pt.utad.mei.aps;

public class FileSystem extends Storage {
    public FileSystem(long capacity) {
        super(capacity);
    }

    @Override
    public String toString() {
        return "File system: %d bytes".formatted(this.getCapacity());
    }
}
