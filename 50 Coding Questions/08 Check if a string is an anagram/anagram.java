import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams of each other");
        } else {
            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            if (Arrays.equals(chars1, chars2)) {
                System.out.println("The strings are anagrams of each other");
            } else {
                System.out.println("The strings are not anagrams of each other");
            }
        }
    }
}