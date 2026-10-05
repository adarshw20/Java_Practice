package assignment_set_4;

import java.util.Scanner;

public class FindNumbers {

    public static int[] findNums(int num1, int num2){
        int[] numbers = new int[6];
        int pos = 0;
        int sum = 0;
        if(num1 >= num2){
            return numbers;
        }
        for(int i = num1; i <= num2; i++){
            if(i >= 10 && i <= 99){
                sum = (i/10) + (i%10);
                if(i % 5 == 0 & sum % 3 ==0) {
                    if (pos < numbers.length) {
                        numbers[pos] = i;
                        pos++;
                    }
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int [] numbers = findNums(num1, num2);
        if(numbers[0] == 0){
            System.out.println("There is no such number!");
        }
        else{
            for (int i = 0; i < numbers.length; i++){
                if(numbers[i] == 0){
                    break;
                }
                System.out.println(numbers[i]);
            }
        }
    }
}
