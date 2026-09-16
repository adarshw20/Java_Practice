package ASSIGNMENT_SET_2;

import java.util.Scanner;

public class OTPGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();
        String out ="";

        for(int i =0 ; i < inStr.length(); i++){
            String ch = String.valueOf(inStr.charAt(i));
            int digit = Integer.parseInt(ch);
            if(digit % 2 == 0){
                continue;
            }
            //System.out.println(digit);
            out += "" + digit*digit;
        }
        if (out.isEmpty()){
            out = "X";
            System.out.println(out);
        }
        else {
            System.out.println(out.substring(0, 4));
        }
        sc.close();
    }
}
