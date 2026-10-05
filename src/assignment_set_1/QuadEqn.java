package assignment_set_1;

import java.util.Scanner;

public class QuadEqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double disc = b * b - 4 * a * c;

        if(a==0){
            System.out.println("Invalid");
        }
        else {
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);

            if (disc == 0) {
                System.out.printf("The root is %.1f", x1);
            } else if (disc > 0) {
                System.out.printf("The roots are %.1f", x1);
                System.out.printf(" and %.1f", x2);
            } else {
                System.out.println("The equation has no real roots");
            }
        }
        sc.close();
    }
}
