package O4.OOPsIntro;

class machine{
    private String name;
    private int code;

    public machine(){
        System.out.println("constructor running");
        name = "Saj";
    }

    public machine(String name){
        System.out.println("Second constructor is running");
        this.name = name;
    }
    public machine(String name, int code){
        System.out.println(("third constructor is running"));
        this.name=name;
        this.code=code;
    }
}

public class constructors {
    public static void main(String[] args) {
        machine machine1 = new machine();
        machine machine2 = new machine("Bertie");
        machine machine3 = new machine("Berndt",32);
    }
}
