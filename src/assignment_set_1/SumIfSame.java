package assignment_set_1;

import java.util.Scanner;

public class SumIfSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        if(num1 == num2){
            System.out.println(sum);
        }
        else{
            System.out.println(2*sum);
        }
        sc.close();
    }
}
