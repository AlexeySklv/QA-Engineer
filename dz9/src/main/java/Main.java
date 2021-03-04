
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    static class Person {
        enum Course {
            ENGINEER, DIRECTOR, MANAGER;
        }

        private String name;
        private int sum;
        private Course course;

        public Person(String name, int sum, Course course) {
            this.name = name;
            this.sum = sum;
            this.course = course;
        }

        public int getAge() {
            return sum;
        }
    }

    private static void streamSimpleTask() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", 1, Person.Course.MANAGER),
                new Person("Bob2", 2, Person.Course.DIRECTOR),
                new Person("Bob3", 3, Person.Course.ENGINEER),
                new Person("Bob4", 4, Person.Course.ENGINEER),
                new Person("Bob5", 5, Person.Course.MANAGER),
                new Person("Bob6", 6, Person.Course.MANAGER),
                new Person("Bob7", 7, Person.Course.ENGINEER),
                new Person("Bob8", 8, Person.Course.MANAGER)
        ));

        List<String> engineersNames = persons.stream()
                .filter(person -> person.course == Person.Course.ENGINEER)
                .sorted((o1, o2) -> o1.sum - o2.sum)
                .map((Function<Person, String>) person -> person.name)
                .collect(Collectors.toList());
        System.out.println(engineersNames);
    }

    public static void main(String[] args) {
        streamSimpleTask();
    }

}
