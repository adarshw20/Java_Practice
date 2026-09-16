package ASSIGNMENT_SET_1;

import java.util.Scanner;

public class DistanceAndCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veg = 12;
        int nonveg = 15;
        System.out.println("Enter foodtype (V or N): ");
        char type = sc.next().charAt(0);
        System.out.println("Enter quantity: ");
        int quant = sc.nextInt();
        System.out.println("Enter distance: ");
        int dist = sc.nextInt();
        int cost = 0;

        if((type != 'V' && type != 'N') ||( quant < 1) || (dist < 1)){
            System.out.println(-1);
        }
        else {
            if(dist <= 3){
                if(type == 'V'){
                    cost = quant * veg;
                }
                else if (type == 'N') {
                    cost = quant * nonveg;
                }
            }
            if (dist > 3 && dist <= 6) {
                if(type == 'V'){
                    cost = quant * veg + (dist-3);
                }
                else if (type == 'N') {
                    cost = quant * nonveg + (dist-3);
                }
            }
            if(dist > 6){
                if(type == 'V'){
                    cost = quant * veg + 3 + (2*(dist -6));
                }
                else if (type == 'N') {
                    cost = quant * nonveg + 3 + (2*(dist -6));
                }
            }
        }
        System.out.println("Total bill: " + cost);
        sc.close();
    }
}
