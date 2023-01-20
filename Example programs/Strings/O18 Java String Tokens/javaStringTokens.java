import java.io.*;
import java.util.*;

public class javaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        if(!scan.hasNext()){
            System.out.println(0);
        }else{
        String s = scan.nextLine().trim();
        String S[]  = s.split("[^A-Za-z]+");
        System.out.println(S.length);
        
        for( String word : S){
            System.out.println(word);
        }
        }
        scan.close();
    }
}