package O23.EnumType;

public enum Animal { //enum is enumerated type
    CAT("Tom"),DOG("Butch"),HAMSTER("Larry");

    private String name;
    Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
