import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {

        System.out.println("Type how many elements your Array will have :");
        Scanner reader = new Scanner(System.in);
        int arrayElements = reader.nextInt();
        int[] myArray = new int[arrayElements];

        for (int i = 0; i < arrayElements; i++) {
            System.out.println("Enter your int in Array");
            int intInArray = reader.nextInt();
            myArray[i] = intInArray;
        }
        System.out.println("Your reversed Array is :");
        for (int i = arrayElements - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
    }
}
