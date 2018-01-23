package c1;

import java.util.Scanner;

public class StringRotation {

    public static boolean stringRotation(String s1, String s2){
        boolean result = false;

        if(s1.length() != s2.length()){
            return false;
        }
        if((s1 + s1).contains(s2)){
            result =  true;
        }

        return result;
    }

    public static void main(String args[]){
        String input1 = new Scanner(System.in).next();
        String input2 = new Scanner(System.in).next();
        boolean result = stringRotation(input1, input2);
        System.out.println(result);
    }
}
