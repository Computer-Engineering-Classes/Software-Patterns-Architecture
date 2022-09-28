package pt.utad.mei.aps;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private final LocalDate birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        var interval = Period.between(birthDate, LocalDate.now());
        return interval.getYears();
    }

    public Person(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

}
