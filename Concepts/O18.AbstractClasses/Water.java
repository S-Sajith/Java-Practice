package O18.AbstractClasses;

public abstract class Water { //abstract class cannot be instantiated
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void changeState(); //abstract method cannot be implemented
}
