public class zadatak9 {
    public static <string> void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                sum = sum + array1[i] + array2[j];
            }
        }
        System.out.println(sum);


    }
}
