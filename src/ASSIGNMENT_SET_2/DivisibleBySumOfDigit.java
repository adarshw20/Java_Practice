package ASSIGNMENT_SET_2;

import java.util.Scanner;

public class DivisibleBySumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;

        while(temp != 0){
            int digit = temp%10;
            temp /= 10;
            sum += digit;
        }

        if(num % sum == 0){
            System.out.println(num + " is divisible by sum of its digits");
        }
        else{
            System.out.println(num + " is not divisible by sum of its digits");
        }
        sc.close();
    }
}
