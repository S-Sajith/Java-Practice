package O21.EqualsMethod;

import java.util.Objects;

class Dudes{
    String name;
    int ID;

    public Dudes(String name,int ID){
        this.name = name;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dudes dudes = (Dudes) o;
        return ID == dudes.ID && Objects.equals(name, dudes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "Dudes{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';


    }
}



public class AppEqual {
    public static void main(String[] args) {
        Dudes Sajith = new Dudes("Sajith",1);
        Dudes Munna = new Dudes("Sajith", 1);

        System.out.println(Sajith==Munna);
        System.out.println(Sajith.equals(Munna));

        Double num1 = 6.9;
        Double num2 = 6.9;
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));

        int val1 = 1;
        int val2 = 1;
        System.out.println(val1==val2);
    }
}
