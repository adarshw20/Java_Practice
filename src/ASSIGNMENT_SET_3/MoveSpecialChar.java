package ASSIGNMENT_SET_3;

import java.util.Scanner;

public class MoveSpecialChar {
    public  static String moveChar(String inStr){
        String special = "";
        String outStr = "";
        char[] charArr = inStr.toCharArray();

        for(char ch : charArr){
            char temp;
            if(Character.isLetterOrDigit(ch)){
                outStr += "" + ch;
            }
            else{
                special += "" + ch;
            }
        }
        outStr += special;
        //System.out.println(outStr);
        return outStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.next();
        System.out.println(moveChar(inStr));
        in.close();
    }
}
