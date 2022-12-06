package pt.utad.mei.aps;

import java.math.BigDecimal;

public interface Dispenser {
    void setNext(Dispenser next);

    void change(BigDecimal amount);
}
