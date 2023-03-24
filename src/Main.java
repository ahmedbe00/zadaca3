
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How big do you want to be your Array");
        Scanner reader = new Scanner(System.in);
        int number= reader.nextInt();
        int[] myArray = new int[number];


        for (int i=0; i<number;i++) {
            System.out.println("Enter your int in Array");
            int intInArray = reader.nextInt();
            myArray[i] = intInArray;
        }

        for (int i=number-1; i>=0;i--){
            System.out.println(myArray[i]);
            if (myArray[i]%2==0){
                System.out.println("The number is divisible with 2");

            }
            else
                System.out.println("The number is NOT divisible with 2");

            if (myArray[i]>10){
                System.out.println("The number is bigger than 10");

            }
            else {
                System.out.println("The number is smaller than 10");

            }
        }














    }
}