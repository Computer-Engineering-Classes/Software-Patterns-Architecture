package pt.utad.mei.aps;

public class DbConnectionPool extends Pool<DbConnection> {

    public DbConnectionPool(int size) {
        super(size);
    }

    public void listConnections() {
        System.out.println("Available connections:");
        for (var connection: this.objects) {
            System.out.println("\t" + connection);
        }
    }
    @Override
    public DbConnection get() {
        DbConnection connection = null;
        try {
            connection = this.objects.take(); // Should use poll() instead
        } catch (InterruptedException e) {
            System.err.println("Error: No more available connections.");
        }
        return connection;
    }

    @Override
    public void release(DbConnection dbConnection) {
        if (dbConnection == null) {
            throw new NullPointerException("Null database connection.");
        }
        var result = this.objects.offer(dbConnection);
        if (!result) {
            System.err.println("Error: Too many connections.");
        }
    }

    @Override
    protected void addObject() {
        this.objects.add(new DbConnection("Server=Webima;Database=WebimaDB;User Id=admin;Password=admin"));
    }
}
