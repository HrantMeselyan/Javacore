package homework.sortedTreeSet;


import java.util.*;

public class PersonStorage {

    Set<Person> people = new TreeSet<>(new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    public void add(Person person) {
        people.add(person);
    }


    public void personsPrint() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}