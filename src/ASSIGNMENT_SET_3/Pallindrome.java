package ASSIGNMENT_SET_3;

import java.util.Scanner;

public class Pallindrome {
    public  static boolean checkPallindrome(String str){
        boolean isPalindrome = false;
        String out = "";
        for (int i = str.length()-1; i >= 0; i--){
            out += str.charAt(i);
        }
        if(out.equals(str)){
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(checkPallindrome(str)){
            System.out.println("The String is a palindrome!");
        }
        else {
            System.out.println("The String is not a palindrome!");
        }

    }
}
