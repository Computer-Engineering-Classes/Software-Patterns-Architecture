package pt.utad.mei.aps;

public class ExtendedEmployee implements IEmployee {
    private final Employee employee;
    private final String email;
    private final String phone;

    public ExtendedEmployee(Employee employee, String email, String phone) {
        this.employee = employee;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public void details() {
        employee.details();
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
