import java.util.Arrays;

public class SortDates {

    // Extract integer from string between index start (inclusive) to end (exclusive)
    // No parseInt — manual char-by-char conversion
    static int extract(String s, int start, int end) {
        int num = 0;
        for (int i = start; i < end; i++) {
            num = num * 10 + (s.charAt(i) - '0');
        }
        return num;
    }

    // Parse DD/MM/YYYY → int[]{YYYY, MM, DD}
    static int[] parseDate(String date) {
        int dd   = extract(date, 0, 2);
        int mm   = extract(date, 3, 5);
        int yyyy = extract(date, 6, 10);
        return new int[]{yyyy, mm, dd};
    }

    // Compare two dates: negative → a before b, positive → b before a
    static int compareDates(String a, String b) {
        int[] da = parseDate(a);
        int[] db = parseDate(b);
        if (da[0] != db[0]) return da[0] - db[0];  // compare year
        if (da[1] != db[1]) return da[1] - db[1];  // compare month
        return da[2] - db[2];                        // compare day
    }

    static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareDates(arr[j], arr[j + 1]) > 0) {
                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[][] testCases = {
                {"10/03/2015", "05/01/2014", "22/12/2013"},
                {"01/01/2020", "01/01/2020", "31/12/2019"},
                {"15/08/1947", "26/01/1950", "02/10/1869"},
                {"28/02/2000", "01/03/2000", "29/02/2000"},
                {"31/12/1999", "01/01/2000", "15/06/1999"}
        };

        for (String[] arr : testCases) {
            System.out.println("Input:  " + Arrays.toString(arr));
            bubbleSort(arr);
            System.out.print("Output: ");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(arr[i]);
            }
            System.out.println("\n");
        }
    }
}