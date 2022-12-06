package pt.utad.mei.aps;

import java.math.BigDecimal;

public class ChangeDispenser implements Dispenser {
    protected final BigDecimal value;
    protected Dispenser next;

    protected ChangeDispenser(double value) {
        this.value = BigDecimal.valueOf(value);
    }

    @Override
    public void setNext(Dispenser next) {
        this.next = next;
    }

    @Override
    public void change(BigDecimal amount) {
        if (amount.compareTo(value) >= 0) {
            int count = amount.divideToIntegralValue(value).intValue();
            BigDecimal remainder = amount.remainder(value);
            System.out.println("Dispensing " + count + " notes of " + value);
            if (remainder.compareTo(BigDecimal.ZERO) > 0 && next != null) {
                next.change(remainder);
            }
        }
        else if (next != null) {
            next.change(amount);
        }
    }
}
