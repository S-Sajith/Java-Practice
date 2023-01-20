package O23.EnumType;

public class EnumDemo {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal){
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case HAMSTER:
                System.out.println("Hamster");
                break;
            default:
                System.out.println("Animal");
                break;
        }
        System.out.println(Animal.DOG.getName());
        System.out.println(Animal.CAT);
        System.out.println("Enum name as a string: " + Animal.DOG.name());

        Animal animal1 = Animal.valueOf("HAMSTER");
        System.out.println(animal1);
    }
}
