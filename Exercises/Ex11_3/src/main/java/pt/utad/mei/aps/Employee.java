package pt.utad.mei.aps;

public record Employee(int number, String name, String username, String password, String address) implements IEmployee {

    @Override
    public void details() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Address: " + address);
    }
}
