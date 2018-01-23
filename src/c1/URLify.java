package c1;

import java.util.Scanner;

public class URLify {

    public static String uRLify(String phrase, int charNumber){
        String result = "";
        String replaceString = "%20";

        for(int i = 0; i < charNumber; i++){
            if(phrase.charAt(i) == ' '){
                result = result.concat(replaceString);
            }else{
                result += phrase.charAt(i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        String result = uRLify("ad ed tre it       ", 12);
        System.out.println(result);
    }
}
