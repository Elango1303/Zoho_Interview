import java.util.ArrayList;
import java.util.Arrays;

public class mismatchedsubstrings {

//    Given two strings of same length, find all mismatched
//    substrings S1: abbcddeefceeacbbed
//    S2: abbefieefceeacbijd
//    Output: cdd, efi be, ij

    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String str1 = "abbcddeefceeacbbed";
        String str2 = "abbefieefceeacbijd";

        for(int j = 0 ; j < str1.length() ; j++){
           if(str1.charAt(j) != str2.charAt(j)){
               String str01 = "";
               String str02 = "";
               while(str1.charAt(j) != str2.charAt(j)){
                   str01 += str1.charAt(j);
                   str02 += str2.charAt(j);
                   j++;
               }
               if(!str01.isEmpty() && !str02.isEmpty()){
                   list.add(str01);
                   list.add(str02);
               }
           }
        }
        for(String str : list){
            System.out.println(str);
        }
    }
}
