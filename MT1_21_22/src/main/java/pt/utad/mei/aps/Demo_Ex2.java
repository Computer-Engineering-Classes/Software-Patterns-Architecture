package pt.utad.mei.aps;

import java.util.Scanner;

public class Demo_Ex2 {
    public static void main(String[] args) {
        // Showcase storage types and pick one
        var scanner = new Scanner(System.in);

        System.out.println("Storage type:");
        for (StorageType type : StorageType.values()) {
            System.out.println(type.ordinal() + " -> " + type);
        }

        System.out.print("Option (UPPERCASE): ");
        var str = scanner.nextLine();
        var type = StorageType.valueOf(str);

        // Create factory
        StorageFactory factory = null;

        switch (type) {

            case RAM -> factory = new RamFactory();
            case FILESYSTEM -> factory = new FileSystemFactory();
            case DATABASE -> factory = new DatabaseFactory();
            case CLOUD -> factory = new CloudFactory();
        }

        // Create and use storage
        var storage = factory.getStorage();
        System.out.println(storage);

        var content1 = new Content(145_000_000L);

        System.out.println("Available storage (before storing content): " + storage.getAvailableStorage());

        var id1 = storage.storeContent(content1);
        var id2 = storage.storeContent(new Content(2_267_655_000L));

        System.out.println("Content 1 ID: " + id1);
        System.out.println("Content 2 ID: " + id2);

        System.out.println("Available storage (after storing content): " + storage.getAvailableStorage());
        System.out.printf("Content with ID %s: %s\n", id2, storage.retrieveContent(id2));
    }
}