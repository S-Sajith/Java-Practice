package O3.Arrays;

public class arraysDemo {
    public static void main(String[] args) {
        int[] values = {1,2,3};

        for (int i : values) {
            System.out.println(i);
        }

        for(int j=0; j<values.length; j++){
            System.out.println(j);
        }

        String text[] = new String[2];

        for( String texts : text){
            System.out.println(texts);
        }
    }
}
