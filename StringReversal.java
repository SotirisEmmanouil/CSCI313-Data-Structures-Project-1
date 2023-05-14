import java.util.Scanner;

public class StringReversal {

public static String StringReversalMethod(String normalstring){
                if (normalstring.isEmpty())
                        return normalstring;
                return StringReversalMethod(normalstring.substring(1)) + normalstring.charAt(0);
         }  //keep taking the substring starting from position 1, then adding the first character at the end, recursively
  
public static void main(String[] args) {
    String str;
    System.out.println("Enter a string to be reversed: ");
    Scanner stringinput = new Scanner(System.in);
    str = stringinput.nextLine();
    String reversedstring = StringReversalMethod(str);
    System.out.println("The reversed form of this string is: " + reversedstring);
    }
}
