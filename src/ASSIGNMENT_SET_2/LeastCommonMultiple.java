package ASSIGNMENT_SET_2;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        LCM = (a × b)/GCD
//        GCD formula
//        rem = a%b
//        a = b
//        b = rem
        int a = num1;
        int b = num2;

        if(num1 == 0 || num2 == 0){
            System.out.println(0);
        }

        while(b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }

        int gcd = a;
        int lcm = (num1*num2) /gcd;

        System.out.println(lcm);
        sc.close();
    }
}

