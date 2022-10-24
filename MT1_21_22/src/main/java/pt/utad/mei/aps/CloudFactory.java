package pt.utad.mei.aps;

public class CloudFactory implements StorageFactory {
    @Override
    public Storage getStorage() {
        return new Cloud(1_000_000_000_000L);
    }
}
