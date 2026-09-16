package ASSIGNMENT_SET_2;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);

        for(char ch = start; ch <= end; ch++){
            System.out.println((int)ch);
        }
        sc.close();
    }
}
