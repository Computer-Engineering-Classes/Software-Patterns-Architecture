package pt.utad.mei.aps;

public class ExtendedEmployee extends EmployeeDecorator {
    private final String email;
    private final String phone;

    public ExtendedEmployee(Employee employee, String email, String phone) {
        super(employee);
        this.email = email;
        this.phone = phone;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
