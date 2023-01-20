package O14.Generics;

import java.util.ArrayList;
import java.util.HashMap;

class Machine{
    @Override
    public String toString() {
        return "Machine";
    }
}
class Camera extends Machine{

}

public class generics {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Cat");
        String animal = strings.get(0);
        System.out.println(animal);

        ////////there can be more than 1 argument//////////////
        HashMap<String,Integer> list = new HashMap<String,Integer>();

        ArrayList<?> machine = new ArrayList<>(); // ? is wildcard , you can pass parameters of nay type
    }
}
