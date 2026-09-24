import java.util.Arrays;

public class Lexicographic_Sorting {

    public static void main(String[] args) {
        String[][] testCases = {
                {"banana", "apple", "cherry", "date"}, // Output: [apple, banana, cherry, date]
                {"zebra", "ant", "mango", "apple", "zoo"}, // Output: [ant, apple, mango, zebra, zoo]
                {"dog", "do", "door", "dot"}, // Output: [do, dog, door, dot]
                {"same", "same", "same"}, // Output: [same, same, same]
                {"z", "a", "m", "b"} // Output: [a, b, m, z]
        };

        for (String[] arr : testCases) {
            System.out.println("Input:  " + Arrays.toString(arr));
            bubbleSort(arr);
            System.out.println("Output: " + Arrays.toString(arr));
            System.out.println();
        }
    }
    public static void bubbleSort(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                String str1 = arr[j];
                String str2 = arr[j + 1];
                char ch2 = str2.charAt(0);
                char ch1 = str1.charAt(0);

                if (ch2 < ch1) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else if (ch2 == ch2) {
                    if(str1.length() > str2.length()){
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }
        }
    }
}
