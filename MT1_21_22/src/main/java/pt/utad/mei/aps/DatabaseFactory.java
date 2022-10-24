package pt.utad.mei.aps;

public class DatabaseFactory implements StorageFactory {
    @Override
    public Storage getStorage() {
        return new Database(256_000_000_000L);
    }
}
