import java.util.Scanner;

public class zadatak5 {
    public static <string> void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter lower number in range:");
        int lowerLimit = reader.nextInt();
        System.out.println("Please enter upper number in range:");
        int upperLimit = reader.nextInt();
        int[] myArray = new int[upperLimit - lowerLimit + 1];
        System.out.println("Even numbers for range from " + lowerLimit + " to " + upperLimit + " are:");

        if (lowerLimit < upperLimit) {
            System.out.println("Even numbers for range from " + lowerLimit + " to " + upperLimit + " are:");


            for (int i = lowerLimit + 1; i < upperLimit; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                else {
                    System.out.println("The number "+i+" is not divisible with 2");
                }



            }

        } else {
            System.out.println("The number " + upperLimit + " must be bigger than " + lowerLimit+", so change the positions of numbers1");
        }

    }
}