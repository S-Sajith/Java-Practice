package JavaCollections.CustomObjects;

import O25.Serialization.Person;

import java.util.*;

class Employees{
    int ID;
    String name;

    public Employees(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return ID == employees.ID && name.equals(employees.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }
}

public class Custom {
    public static void main(String[] args) {

        //without equals() and hasCode() the employee Bono gets added twice(duplicate item)
        Employees e1 = new Employees(0,"Ozzy");
        Employees e2 = new Employees(1,"Bono");
        Employees e3 = new Employees(2,"Fonz");
        Employees e4 = new Employees(1,"Bono");

        Map<Employees,Integer> map = new LinkedHashMap<Employees,Integer>();
        map.put(e1,1);
        map.put(e2,2);
        map.put(e3,3);
        map.put(e4,1);

        for(Employees key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
