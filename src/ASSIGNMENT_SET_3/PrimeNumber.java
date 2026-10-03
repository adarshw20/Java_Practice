package ASSIGNMENT_SET_3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] inArr = new int[size];

        for(int i = 0; i < size; i++){
            inArr[i] = in.nextInt();
        }
        int count = 0;

        for(int n : inArr){
            if(n>1){
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(n); j++){
                    if(n % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    count++;
                }
            }
        }

        if(count == 0){
            System.out.println(0);
            in.close();
            return;
        }
        //System.out.println(count);
        int[] outArr = new int[count];
        int i = 0;
        for (int n : inArr){
            if(n>1){
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(n); j++){
                    if(n % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    outArr[i] = n;
                    i++;
                }
            }
        }

        for(int idx = 0; idx < count; idx++){
            System.out.println(outArr[idx]);
        }
        in.close();
    }
}
