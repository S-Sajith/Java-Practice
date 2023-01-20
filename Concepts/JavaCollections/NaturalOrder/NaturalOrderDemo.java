package JavaCollections.NaturalOrder;

import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}

public class NaturalOrderDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);

    }
    private static void addElements(Collection<Person> col){
        col.add(new Person("Joe"));
        col.add(new Person("Sal"));
        col.add(new Person("Murr"));
        col.add(new Person("Q"));
    }
    private static void showElements(Collection<Person> col){
        for (Person elements:
             col) {
            System.out.println(elements);
        }
    }
}
