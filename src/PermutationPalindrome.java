import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PermutationPalindrome {
    public static boolean palindromePermutation(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
            else{
                set.remove(s.charAt(i));
            }
        }
        return set.size()<2;
    }

    public static String makeResponse(boolean result, ArrayList<String> pList){
        String text = "";
        for(String p : pList){
            text = text+p+", ";
        }
        return String.valueOf(result)+"(permutations: "+")";
    }

    public static void main(String [] args){
        String input = new Scanner(System.in).next();
        boolean result = palindromePermutation(input);
        System.out.println(result);
    }
}
