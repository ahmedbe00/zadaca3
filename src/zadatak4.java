import java.util.Scanner;

public class zadatak4 {
    public static <string> void main(String[] args) {

        System.out.println("Type your word");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        char[] wordChar = word.toCharArray();
        char[] reversedWordChar = new char[wordChar.length];
        for (int i = 0; i < wordChar.length; i++) {
            reversedWordChar[i]=wordChar[wordChar.length-i-1];

        }
        for (int i = 0; i < wordChar.length; i++) {
            
          if  (reversedWordChar[i]!=wordChar[i]) {
            System.out.println("Word is not a polindrome");
            return; // I couldn't think of a better idea than to use only this return option, which we didn't learn
          }

        }
        System.out.println("Word is a polindrome");


    }
}
