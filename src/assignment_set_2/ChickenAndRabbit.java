package assignment_set_2;

import java.util.Scanner;

public class ChickenAndRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heads =sc.nextInt();
        int legs =sc.nextInt();
        int chicken, rabbit, totallegs;
        boolean found = false;

        if(legs % 2 !=0 || legs < 2*heads || legs > 4*heads){
            System.out.println("Invalid");
        }

        for(chicken = 0; chicken < heads; chicken++){
            rabbit = heads-chicken;
            totallegs = 2*chicken + 4*rabbit;
            if (totallegs == legs){
                System.out.println("Chicken = "+ chicken);
                System.out.println("Rabbit = " + rabbit);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The number of chicken and rabbit cannot be found");
        }
        sc.close();
    }
}
