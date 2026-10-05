package assignment_set_2;

import java.util.Scanner;

public class ValidateTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ang1 = sc.nextInt();
        int ang2 = sc.nextInt();
        int ang3 = sc.nextInt();

        if(ang1+ang2+ang3 ==180){
            if(ang1 == 90 || ang2 == 90 || ang3 ==90){
                System.out.println("Right angled triangle can be formed");
            }
            else{
                System.out.println("Right angled triangle cannot be formed");
            }
        }
        else{
            System.out.println("Triangle cannot be formed");
        }
        sc.close();
    }
}
