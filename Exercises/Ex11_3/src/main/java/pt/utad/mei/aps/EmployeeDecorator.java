package pt.utad.mei.aps;

public abstract class EmployeeDecorator implements IEmployee {
    protected final IEmployee employee;

    public EmployeeDecorator(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public int number() {
        return employee.number();
    }

    @Override
    public String name() {
        return employee.name();
    }

    @Override
    public String username() {
        return employee.username();
    }

    @Override
    public String password() {
        return employee.password();
    }

    @Override
    public String address() {
        return employee.address();
    }

    @Override
    public void details() {
        employee.details();
    }
}
