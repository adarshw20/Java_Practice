package assignment_set_1;

import java.util.Scanner;

public class AreaOFCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of Circle with radius "+ radius + " is : " + "%.2f", area);
        sc.close();
    }
}
