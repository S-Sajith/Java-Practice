package O4.OOPsIntro;

class person{
    // Classes contain

    // 1.Data (Instance variables)
    String name;
    int age;
    
    // 2.Subroutines (methods)
    void speak(){ // void return type doesn't return anything
        System.out.println("My name is " + name + " I am "  + age +  " years old");
    }
    int retirement(){ //method with int return type
        int yearsLeft = 65 - age;
        return yearsLeft;
    }

    public void greet(String text){
        System.out.println(text + " means hello where I come from !");
    }

    // Getter methods
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    //passing multiple parameters in a method
    public void move(String direction , int steps){
        System.out.println("I moved " + steps + "steps in " + direction + " direction");
    }
}


public class classesAndObjects {
    public static void main(String[] args) {
        
        person person1 = new person();
        person1.name = "Saj";
        person1.age = 21;
        person1.speak();
        int years = person1.retirement();
        System.out.println("Years till retirement is " + years);

        int age = person1.getAge();
        String name = person1.getName();
        System.out.println(name + "'s age is " + age);

        person1.greet("Namaskara");
    }
}
