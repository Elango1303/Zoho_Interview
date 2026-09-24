public class NumberToAlphabet {
    public static void main(String[] args) {
        int[] tests = {1, 26, 27, 1000};

        for (int n : tests) {
            System.out.println(n + " -> " + convert(n));
        }
    }

    static String convert(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;                          // shift to 0-indexed
            int rem = n % 26;
            sb.append((char)('A' + rem)); // map 0→A, 1→B, ..., 25→Z
            n = n / 26;
        }

        return sb.reverse().toString();
    }
}