package O7.toStringMethod;

class Frog{

    private int id;
    private String name;

    public Frog(int id,String name ){
        this.id = id;
        this.name = name;
    }
    public String toString(){ // helps in creating string representation of the object
        // return id + " : " + name;
        return String.format("%d : %s",id,name);
    }
}

public class toStringMethod {
    public static void main(String[] args) {
        Frog frog1 = new Frog(32,"Sajith");
        System.out.println(frog1);
    }
}
