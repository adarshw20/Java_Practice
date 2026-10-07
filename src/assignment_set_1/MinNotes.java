package assignment_set_1;

import java.util.Scanner;

public class MinNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note1 = sc.nextInt();
        int note5 = sc.nextInt();
        int amount = sc.nextInt();
        int total = note1 + 5*note5;
        int note1_req;
        int note5_req;

        if(total < amount){
            System.out.println(-1);
        }
        else{
            if(amount/5 <= note5) {
                note5_req = amount / 5;
            }
            else{
                note5_req = note5;
            }
            note1_req = amount - (5*note5_req);
            if(note1_req > note1 || note5_req > note5){
                System.out.println(-1);
            }
            else {
                System.out.println("$1 notes needed : " + note1_req);
                System.out.println("$5 notes needed : " + note5_req);
            }
        }
        sc.close();
    }
}
