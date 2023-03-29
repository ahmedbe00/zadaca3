public class zadatak6 {
    public static <string> void main(String[] args) {

        String[] array1 = {"Car", "banana", "mouse"};
        String[] array2 = {"Gorjan", "Sarajevo"};
        String[] array3 = {"kiwi", "lemon", "BMW"};
        String[] connectedArrays = new String[array1.length + array2.length + array3.length];
        int index=0;

        for (int i=0;i<array1.length;i++){
             connectedArrays[index]=array1[i];
             index++;
         }
        for (int i=0;i<array2.length;i++){
            connectedArrays[index]=array2[i];
            index++;
        }
        for (int i=0;i<array3.length;i++){
            connectedArrays[index]=array3[i];
            index++;
        }
        System.out.println("The big Array is: ");
        for (int j = 0; j < connectedArrays.length; j++) {
            System.out.print(connectedArrays[j] + " ");
        }

    }
}
