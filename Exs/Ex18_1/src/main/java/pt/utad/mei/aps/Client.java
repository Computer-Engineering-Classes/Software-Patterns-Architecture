package pt.utad.mei.aps;

public class Client {
    private final String name;
    private double amountAvailable;
    private double amountInvested;

    public Client(String name, double amountAvailable, double amountInvested) {
        this.name = name;
        this.amountAvailable = amountAvailable;
        this.amountInvested = amountInvested;
    }

    public String getName() {
        return name;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public double getAmountInvested() {
        return amountInvested;
    }

    public void setAmountInvested(double amountInvested) {
        this.amountInvested = amountInvested;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ammountAvailable=" + amountAvailable +
                ", ammountInvested=" + amountInvested +
                '}';
    }
}
