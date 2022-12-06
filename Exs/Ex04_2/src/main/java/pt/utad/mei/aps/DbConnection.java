package pt.utad.mei.aps;

public class DbConnection {
    private final String connectionString;

    public DbConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void query(String query) {
        System.out.println("Querying the database...");
        System.out.printf("Connection: %s\n", connectionString);
        System.out.printf("Query: %s\n", query);
    }

    @Override
    public String toString() {
        return "DbConnection{" + "hashCode='" + hashCode() + "'}";
    }
}
