package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var factory = new StorageFactory();

        var cloudStorage = factory.getStorage(StorageType.CLOUD);

        System.out.println(cloudStorage);

        var content1 = new Content(145_000_000L);

        System.out.println("Available storage (before storing content): " + cloudStorage.getAvailableStorage());

        var id1 = cloudStorage.storeContent(content1);
        var id2 = cloudStorage.storeContent(new Content(2_267_655_000L));

        System.out.println("Content 1 ID: " + id1);
        System.out.println("Content 2 ID: "+ id2);

        System.out.println("Available storage (after storing content): " + cloudStorage.getAvailableStorage());
        System.out.printf("Content with ID %s: %s\n", id2, cloudStorage.retrieveContent(id2));
    }
}