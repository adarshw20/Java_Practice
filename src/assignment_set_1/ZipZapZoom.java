package assignment_set_1;

import java.util.Scanner;

public class ZipZapZoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%3 == 0 && num%5 ==0){
            System.out.println("Zoom");
        }
        else if(num%3 == 0){
            System.out.println("Zip");
        }
        else if(num%5 == 0){
            System.out.println("Zap");
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
