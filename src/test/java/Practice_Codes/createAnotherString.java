package Practice_Codes;

public class createAnotherString {
    public static void main(String[] args) {
    
    String input = "something else";
    String output = "";


    for (int i =0; i<input.length();i++){
        char currentChar = input.charAt(i);
        if(currentChar != ' ' && input.indexOf(currentChar) == input.lastIndexOf(currentChar)){
            output += currentChar;
        }
    }
    System.out.println(output);
    }

    
}
