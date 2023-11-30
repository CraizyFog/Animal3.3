import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 2017, 12);
        Cat murca = new Cat("Murca", 2018, 14);
        Cat murzic = new Cat("Murzic", 2014, 7);
        Dog zver = new Dog("Zver", 2018, 19);
        Dog luna = new Dog("Luna", 2020, 7);
        Dog shurick = new Dog("Shurick", 2016, 10);

        List<Cat> cats = new ArrayList<>(List.of(tom, murca, murzic));
        Collections.sort(cats);
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        List<Dog> dogs = new ArrayList<>(List.of(shurick, zver, luna));
        Collections.sort(dogs);
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));

        for (PatAnimal animal : rancho) {
            System.out.println(animal.getName() + " " + animal.getAge() + " years");
        }
    }
}