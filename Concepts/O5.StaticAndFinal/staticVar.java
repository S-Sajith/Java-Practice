package O5.StaticAndFinal;

import javax.lang.model.element.Name;

class Thing{
    
    // static can be used to create constant data and count the number of objects we create , creating IDs

    public final static int LUCKY_NUMBER = 7; // final cant be reassigned a value like const

    public static int count;

    public int id;

    public Thing(){

        id = count;

        count++;
    }

    public String name; // these are instance variables (not static)
    public static String description; // static member variables belong to the class and there is only one copy

    public void showName(){
        System.out.println("object id: " + id + " , " +  description + name); // instance methods can access static data
    } 

    public static void showDesc(){
        System.out.println("henlo");
        // wont work System.out.println(name);
    }
}

public class staticVar {
    public static void main(String[] args) {

        Thing.description = "I am a thing";

        Thing.showDesc();

        System.out.println("before object creation " + Thing.count);

        System.out.println(Thing.description);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("after object creation " + Thing.count);

        thing1.name = "Jesse";
        thing2.name= "James";

        thing1.showName();
        thing2.showName();

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
