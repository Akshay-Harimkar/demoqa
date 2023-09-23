package Practice_Codes;

public class StringPalindrome {
    public static boolean isPalindrom(String str){
        StringBuilder reversedString = new StringBuilder(str).reverse();
        return str.equals(reversedString.toString());
    }

    public static void main(String[] args) {
        String str = "hello";
        String str2 = "level";
       

        System.out.println("Is Palindrome : " + isPalindrom(str));
        System.out.println("Is Palindrome : " + isPalindrom(str2));

    }
}
