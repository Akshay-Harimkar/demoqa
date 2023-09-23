package Practice_Codes;

public class middleCharacterOfString {

    public static void printMiddleCharacterOsString(String str){
        int length = str.length();
        int middleChar = length/2;

        if(length %2 == 0){
            char middleChar1 = str.charAt(middleChar - 1);
            char middleChar2 = str.charAt(middleChar);
            System.out.println("Middle Characters are :-"+middleChar1+middleChar2);
        }else{
            char middleChar3 = str.charAt(middleChar);
            System.out.println(middleChar3);
        }
    }

        public static void main(String[] args) {
            String str = "Akshay";

            printMiddleCharacterOsString(str);
        }

    
}
