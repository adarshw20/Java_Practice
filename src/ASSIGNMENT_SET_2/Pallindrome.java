package ASSIGNMENT_SET_2;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int last = temp % 10;
            rev = rev * 10 + last;
            temp /= 10;
        }

        if(num == rev){
            System.out.println(num + " is a Pallindrome number");
        }
        else{
            System.out.println(num + " is not a Pallindrome number");
        }
        sc.close();
    }
}
