package O6.StringFormatting;

public class stringFormatting {
    public static void main(String[] args) {
        //in java strings are immutable (Not changeable)

        //Inefficient way
        String info = "";
        info += "My name is dandy chiggins,";
        info += " ";
        info += "Me so Dandy";

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Saj,").append(" ").append("I am the game");

        System.out.println(sb.toString());

        // StringBuffer s = new StringBuffer(""); 
        // StringBuilder is a more efficient variant of StringBuffer

        //Formatting/////////////////

        System.out.println("Here is some text.\t That was a tab \n That was a new line");

        System.out.printf("Total cost %d,quantity is %d\n",5, 120);

        for(int i=0;i<20;i++){
            System.out.printf("%-2d: some text here\n",i);
        }

        for(int i=0;i<5;i++){
            System.out.printf("%2d: some text here\n",i);
        }

        System.out.printf("%s\n","some string");
        System.out.printf("%f\n",5.67);
        System.out.printf("%.2f\n",5.67);
        
    }
}
