package pt.utad.mei.aps;

public class RamFactory implements StorageFactory {
    @Override
    public Storage getStorage() {
        return new Ram(16_000_000_000L);
    }
}
