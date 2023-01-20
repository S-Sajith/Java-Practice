package O26.UpDownCast;

class machine {
    public void strt() {
        System.out.println("Machine started");
    }
}
class camera extends machine{
        @Override
        public void strt() {
            System.out.println("Camera started");
        }
        public void snap(){
            System.out.println("Camera snaps");
        }
}

public class run{
    public static void main(String[] args) {
        machine machine1 = new machine();
        camera camera1 = new camera();

        machine1.strt();
        camera1.strt();
        camera1.snap();

        // Upcasting
        machine machine2 = camera1; // polymorphism
        machine2.strt();
        //machine2.snap(); doesn't work

        //DownCasting
        machine machine3 = new camera();
        camera camera2 = (camera)machine3;
        camera2.strt();
        camera2.snap();

    }
}
