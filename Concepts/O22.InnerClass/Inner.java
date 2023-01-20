package O22.InnerClass;

class Robot{
    private int id;

    class Brain{
        public void think(){
            System.out.println("Brain is thinking");
        }
    }

    static class Battery{ //static class can only access static variables
        public void charge(){
            System.out.println("Battery charging");
        }
    }
    public Robot(int id){
        this.id = id;
    }
    public void boot(){
        System.out.println("Robot id: " + id + " is booting");
        Brain brain = new Brain();
        brain.think();

        final String name = "Bobby B";
        class Temp {
            public void doSomething() {
                System.out.println(name + " ID is :" + id);
            }
        }
            Temp newTemp = new Temp();
            newTemp.doSomething();
        }
}


public class Inner {
    public static void main(String[] args) {
        Robot robot = new Robot(1);
        robot.boot();
        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
