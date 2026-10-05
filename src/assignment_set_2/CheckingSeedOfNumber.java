package assignment_set_2;

import java.util.Scanner;

public class CheckingSeedOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int temp = num1;
        int prod = num1;

        while(temp != 0){
            int digit = temp%10;
            prod *= digit;
            temp /= 10;
        }

        if(prod == num2){
            System.out.println(num1 + " is a seed of " + num2);
        }
        else{
            System.out.println(num1 + " is not a seed of " + num2);
        }
        sc.close();
    }
}
