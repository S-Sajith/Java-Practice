public class LastUniqueCharacter {
 public static void main(String[] args) {
  String str = "gibblegabbler";
  char lastUniqueChar = ' ';

  for (int i = 0; i < str.length(); i++) {
   char currentChar = str.charAt(i);
   boolean isUnique = true;

   for (int j = 0; j < str.length(); j++) {
    if (i != j && currentChar == str.charAt(j)) {
     isUnique = false;
     break;
    }
   }

   if (isUnique) {
    lastUniqueChar = currentChar;
   }
  }

  System.out.println("Last unique character of the string is: " + lastUniqueChar);
 }
}