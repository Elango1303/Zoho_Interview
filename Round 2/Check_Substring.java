public class Check_Substring {

    public static void main(String[] args) {

        String str1 = "test123string";
        String str2 = "123";

        System.out.println(findSubstring(str1,str2));



    }

    public static int findSubstring(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i < s1.length(); i++) {
            int j = 0;
            int count = 0;

            while (j < m && s1.charAt(i+j) == s2.charAt(j)) {
                j++;
                count++;
            }
            if(count  == m) return i;

        }
        return -1;

    }
}
