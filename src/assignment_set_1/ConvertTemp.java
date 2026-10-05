package assignment_set_1;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        //c = ((f-32)/9)*5
        Scanner sc = new Scanner(System.in);
        double temp_f = sc.nextDouble();
        double temp_c = ((temp_f -32)/9)*5;
        System.out.printf("Temperature in fahrenheit: %.2f\n", temp_f);
        System.out.printf("Temperature in celsius : %.2f", temp_c);
        sc.close();

    }
}
