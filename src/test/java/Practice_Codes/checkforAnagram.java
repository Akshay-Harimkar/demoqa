package Practice_Codes;

import java.util.Arrays;

public class checkforAnagram {
    
    public static boolean isStringAnagram(String str1 , String str2){
        str1.replace("/s", "").toLowerCase();
        str2.replace("/s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);

    }

    public static boolean isStringAnagram2(String str1, String str2){
        str1.replace("/s", "").toLowerCase();
        str2.replace("/s", "").toLowerCase();

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        if(isStringAnagram2(str1, str2)){
            System.out.println("This are Anagrams");
         }else{
            System.out.println("This are not Anagrams");
         }


    }



}
