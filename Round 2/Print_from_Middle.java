public class Print_from_Middle {
    public static void main(String[] args) {
        String str = "PROGRAM";
        int mid = str.length() / 2;
        StringBuilder ans = new StringBuilder();

        for (int i = mid; i < mid + str.length(); i++) {
            ans.append(str.charAt(i % str.length()));
            System.out.println(ans);
        }
    }
}