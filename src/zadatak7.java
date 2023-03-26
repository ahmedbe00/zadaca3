public class zadatak7 {
    public static <string> void main(String[] args) {

        int[] array1 = {1, 3, 5, 6};
        int[] array2 = {2, 3, 4, 5, 6};

        if (array1.length < array2.length) {
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + array2[i] + ",");

            }
            for (int i = array1.length; i < array2.length; i++) {
                System.out.print(array2[i]);
                if (i < array2.length - 1) {
                    System.out.print(",");

                }

            }


        }

        if (array1.length > array2.length) {
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array1[i] + array2[i] + ",");

            }
            for (int i = array2.length; i < array1.length; i++) {
                System.out.print(array1[i]);
                if (i < array2.length - 1) {
                    System.out.print(",");

                }

            }

        }
        if (array1.length == array2.length) {

            for (int i = 0; i < array2.length; i++) {
                System.out.print(array1[i] + array2[i]);
                if (i < array2.length - 1) {
                    System.out.print(",");

                }

            }
        }


    }
}
