import java.util.Arrays; //I implement this, so I can use Array. commands

public class zadatak8 {
    public static <string> void main(String[] args) {

        String[] myArray = {"Ahmed", "QAmp", "Gorjan", "BBB", "Sarajevo", "KKK0"};
        int removeString = 0;

        for (int i = 0; i < myArray.length; i++) {
            String upperCaseElements = myArray[i].toUpperCase();

            if ((upperCaseElements.contains("A")) || (upperCaseElements.contains("O")) || (upperCaseElements.contains("E")) || (upperCaseElements.contains("I")) || (upperCaseElements.contains("U"))) {
                removeString = removeString + 1;

            }
        }
        String[] newArray = new String[myArray.length - removeString];
        int indexOfNewArray = 0;

        for (int i = 0; i < myArray.length; i++) {

            String upperCaseElements = myArray[i].toUpperCase();

            if ((upperCaseElements.contains("A")) || (upperCaseElements.contains("O")) || (upperCaseElements.contains("E")) || (upperCaseElements.contains("I")) || (upperCaseElements.contains("U"))) {

            } else {
                newArray[indexOfNewArray] = myArray[i];
                indexOfNewArray = indexOfNewArray + 1;

            }

        }


        System.out.println(Arrays.toString(newArray));


    }
}
