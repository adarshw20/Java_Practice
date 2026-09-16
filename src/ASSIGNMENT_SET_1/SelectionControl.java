package ASSIGNMENT_SET_1;

import java.util.Scanner;

public class SelectionControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 == 7) {
            System.out.println(num2 * num3);
        }
        else if (num2 == 7) {
            System.out.println(num3);
        }
        else if(num3 == 7){
            System.out.println(-1);
        }
        else{
            System.out.println(num1 * num2 * num3);
        }
        sc.close();
    }
}
