import java.util.List;
import java.util.Random;

public class App {
    static List<Person> getAdultPeople(List<Person> people) {
        return people
                .stream()
                .filter(Person::isAdult)
                .toList();
    }

    public static void main(String[] args) {
        var people = new Random()
                .ints(10, 29)
                .limit(5)
                .mapToObj(age -> new Person("A", age))
                .toList();

        var adultPeople = getAdultPeople(people);

        System.out.println("--- (1) ---");
        people.forEach(System.out::println);

        System.out.println("--- (2) ---");
        adultPeople.forEach(System.out::println);
    }
}
