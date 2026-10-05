package assignment_set_2;

import java.util.Scanner;

public class DigitProductByPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        int prod = 1;
        int res = 0;

        while(temp != 0){
            count++;
            int last = temp%10;
            prod = last*count;
            res +=prod;
            temp /=10;
        }
        System.out.println(res);

        sc.close();
    }
}
