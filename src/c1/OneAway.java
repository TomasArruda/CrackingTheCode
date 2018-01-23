package c1;

import java.util.HashSet;
import java.util.Scanner;

public class OneAway {

    public static boolean oneAway(String word1, String word2){
        if (word1.equals(word2))
            return false;

        int len1 = word1.length();
        int len2 = word2.length();

        if ((len1 - len2) > 1 || (len2 - len1) > 1  ) {
            return false;
        }

        int i = 0, j = 0;
        int diff = 0;
        while (i<len1 && j<len2) {
            char f = word1.charAt(i);
            char s = word2.charAt(j);
            if (f != s) {
                diff++;
                if (len1 > len2)
                    i++;
                if (len2 > len1)
                    j++;
                if (len1 == len2)
                    i++; j++;
            }
            else{
                i++; j++;
            }
            if (diff > 1) {
                return false;
            }
        }
        // If the length of the string is not same. ex. "abc" and "abde" are not one edit distance.
        if (diff == 1 && len1 != len2 && (i != len1 || j != len2)) {
            return false;
        }
        return true;
    }


    public static void main(String args[]){
        String input1 = new Scanner(System.in).next();
        String input2 = new Scanner(System.in).next();
        boolean result = oneAway(input1, input2);
        System.out.println(result);
    }
}
