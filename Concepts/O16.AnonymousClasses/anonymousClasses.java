package O16.AnonymousClasses;

class Bus{
    public void rev(){
        System.out.println("Bus is revving");
    }
}


public class anonymousClasses {
    public static void main(String[] args) {
        Bus merc = new Bus(){
            @Override
            public void rev() {
                System.out.println("Merc is revving");
            }
        };
        merc.rev();
    }
}
