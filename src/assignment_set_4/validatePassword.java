package assignment_set_4;

import java.util.Scanner;

public class validatePassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.nextLine();
        String outStr = "";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasAlphabets = false;
        boolean hasSpecial = false;
        boolean hasRepetitive = false;
        boolean hasConsecutive = false;

        for(int i = 0; i < inStr.length(); i++){
            char ch = inStr.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpper = true;
            }
            if(Character.isLowerCase(ch)){
                hasLower = true;
            }
            if(Character.isDigit(ch)){
                hasDigit = true;
            }
            if(Character.isLetter(ch)){
                hasAlphabets = true;
            }
            if(Character.isLetterOrDigit(ch)){
                hasSpecial = true;
            }
            for(int j = i+1; j < inStr.length()-1; j++){
                if(inStr.charAt(i) == inStr.charAt(j)){
                    hasRepetitive = true;
                }
            }
        }

        for(int i = 0; i < inStr.length()-1; i++){
            if(inStr.charAt(i) == inStr.charAt(i+1)){
                hasConsecutive = true;
            }
        }

        if(inStr.length() >= 8){
            if(hasUpper && hasLower && hasDigit && hasSpecial && !(hasConsecutive)){
                outStr = "Strong";
            }
            else if (hasUpper && hasDigit && hasSpecial && !(hasRepetitive)) {
                outStr= "Partially Strong";
            }
            else if(hasAlphabets || hasDigit){
                outStr = "Weak";
            }
            else{
                outStr = "Invalid";
            }

        }
        else {
            outStr = "Invalid";
        }
        System.out.println(outStr);
        in.close();
    }
}
