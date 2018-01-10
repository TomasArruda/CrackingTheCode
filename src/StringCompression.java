import java.util.Hashtable;
import java.util.Scanner;

public class StringCompression {
    public static String stringCompression(String word) {
        String result = "";
        Hashtable<Character, Integer> hash = new Hashtable<>();

        int counter = 1;
        char firstChar = word.charAt(0);
        for(int i = 1; i < word.length(); i++) {
            char nextChar = word.charAt(i);
            if(nextChar == firstChar){
                counter++;
            }else{
                result = result+firstChar+counter;
                counter = 1;
            }
            firstChar = nextChar;
        }
        result = result+firstChar+counter;


        if (word.length() == result.length()){
            return word;
        }else{
            return result;
        }
    }

    public static void main(String [] args){
        String input = "none";
        while(!input.equals("exit")) {
            input = new Scanner(System.in).next();

            String result = stringCompression(input);
            System.out.println(result);
        }
    }
}
