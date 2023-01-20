package O4.OOPsIntro;

class frog {
    private String name; // enforcing encapsulation
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class app{
    public static void main(String[] args) {
        frog frog1 = new frog();
        frog1.setName("Bertie");
        frog1.setAge(1);
    }
}