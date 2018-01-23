package c1;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckPermutation {

    public static boolean checkPermutation(String word1, String word2){
        if (word1.length() == word2.length()) {
            int[] array = new int[256];

            for (int i = 0; i < word1.length(); i++) {
                array[word1.charAt(i)] ++;
            }

            for (int i = 0; i < word2.length(); i++) {
                if (--array[word2.charAt(i)] < 0) {
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

    public static void main(String [] args){
        String input1 = new Scanner(System.in).next();
        String input2 = new Scanner(System.in).next();
        boolean result = checkPermutation(input1, input2);
        System.out.println(result);
    }
}
