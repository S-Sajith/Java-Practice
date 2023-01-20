package O18.AbstractClasses;

public class demoW {
    public static void main(String[] args) {
        Ice ice1 = new Ice();
        ice1.setId(5);
        Vapour vapour1 = new Vapour();
        vapour1.setId(1);
        // Water water = new Water(); 'Water' is abstract; cannot be instantiated
        ice1.changeState();
        vapour1.changeState();
    }

}
