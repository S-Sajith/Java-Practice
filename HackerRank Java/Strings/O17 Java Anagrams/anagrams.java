import java.util.Scanner;

public class anagrams {

    static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase().trim();
        String B = b.toLowerCase().trim();
        
        char c[] = A.toCharArray();
        char d[] = B.toCharArray();

        java.util.Arrays.sort(c);
        java.util.Arrays.sort(d);
        
        String aa = new String(c);
        String bb = new String(d);
        
        if(aa.equals(bb)){
            return true;
        }else return false;
        
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    
}