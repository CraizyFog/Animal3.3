import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class PatAnimal {
    public String name;
    public LocalDate yearOfBirth;

    public PatAnimal(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = LocalDate.now().isAfter(LocalDate.ofYearDay(yearOfBirth,1))
                ? LocalDate.ofYearDay(yearOfBirth,1)
                : LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth.getYear();
    }
    public void sleep(){};
    public void makeSound(){};
}
