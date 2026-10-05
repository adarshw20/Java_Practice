package assignment_set_3;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        int temp1 = (int)num;
        int temp2 = (int)num;
        int sum = 0;
        int count = 0;
        while(temp1 != 0) {
            count++;
            temp1 = temp1/10;
        }
        while(temp2 != 0){
            int lastdigit = temp2 % 10;
            sum += Math.pow(lastdigit, count);
            temp2 = temp2/10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }
}
