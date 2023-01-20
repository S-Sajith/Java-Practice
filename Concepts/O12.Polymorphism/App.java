package O12.Polymorphism;

public class App{
    public static void main(String[] args) {
        plant plant1 = new plant();
        tree tree1 = new tree();

        plant plant2 = tree1;

        plant2.grow();

    }
}
