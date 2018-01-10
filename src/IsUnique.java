import java.util.Hashtable;
import java.util.Scanner;

public class IsUnique {

    public static boolean isUnique(String word){
        boolean result = true;
        Hashtable<Character, Integer> hash = new Hashtable<>();
        for(int i = 0; i < word.length(); i++){
            if(!hash.containsKey(word.charAt(i))) {
                hash.put(word.charAt(i), 1);
            }else{
                return false;
            }
        }
        return result;
    }

    public static void main(String [] args){
        String input = "none";
        while(!input.equals("exit")) {
            input = new Scanner(System.in).next();

            boolean result = isUnique(input);
            System.out.println(result);
        }
    }
}
