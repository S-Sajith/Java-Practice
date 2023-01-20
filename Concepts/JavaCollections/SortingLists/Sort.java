package JavaCollections.SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


// to sort the strings according to length
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if(len1>len2){
            return 1;
        }
        else if(len1<len2){
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return o1.compareTo(o2);
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);
    }
}


    public class Sort {

        public static void main(String[] args) {

            ///////////////////////Sorting Strings/////////////////////////
            List<String> animals = new ArrayList<String>();
            animals.add("hyena");
            animals.add("caracal");
            animals.add("mongoose");
            animals.add("honey badger");
            animals.add("beaver");
            animals.add("lynx");

            // Collections.sort(animals , new StringLengthComparator());
//            Collections.sort(animals, new AlphabeticalComparator());
            Collections.sort(animals, new ReverseAlphabeticalComparator());

            for (String animal : animals) {
                System.out.println(animal);
            }


            /////////////////Sorting Numbers//////////////////////////
            List<Integer> numbers = new ArrayList<Integer>();
            numbers.add(55);
            numbers.add(21);
            numbers.add(4);
            numbers.add(7);
            numbers.add(69);

            Collections.sort(numbers, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -o1.compareTo(o2);
                }
            });

            for (Integer number:numbers){
                System.out.println(number);
            }

            ////////////////////Sorting arbitrary classes/////////////////

            List<Person> people = new ArrayList<Person>();
            people.add(new Person(1,"Bob"));
            people.add(new Person(3,"Rob"));
            people.add(new Person(4,"Cob"));
            people.add(new Person(2,"Slob"));


            //sort in order of ID
            Collections.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if(o1.getId()>o2.getId()){
                        return 1;
                    } else if (o1.getId()<o2.getId()) {
                        return -1;
                    }
                    return 0;
                }
            });

            for (Person guy : people){
                System.out.println(guy);
            }

            System.out.println("\n");
            //sort in order of name
            Collections.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (Person guy : people){
                System.out.println(guy);
            }
        }

    }
