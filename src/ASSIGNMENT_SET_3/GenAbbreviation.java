package ASSIGNMENT_SET_3;

import java.util.Scanner;

public class GenAbbreviation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = "";

        String[] inStr = input.split(" ");
        for(int i = 0; i < inStr.length; i++){
            if(inStr[i].length() > 2){
                output += inStr[i].substring(0,1).toUpperCase();
            }
            else if (inStr[i].length() == 2) {
                output += inStr[i].substring(0,1).toLowerCase();
            }
        }
        System.out.println(output);
        in.close();
    }
}
