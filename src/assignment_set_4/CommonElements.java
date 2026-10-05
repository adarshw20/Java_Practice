package assignment_set_4;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); // Size of Array
        //Array 1
        int[] inArr1 = new int[size];
        for(int idx1 = 0; idx1 < size; idx1++){
            inArr1[idx1] = in.nextInt();
        }

        //Array 2
        int[] inArr2 = new int[size];
        for(int idx2 = 0; idx2 < size; idx2++){
            inArr2[idx2] = in.nextInt();
        }

        int[] outArr = new int[size];
        int index = 0;

        if(inArr1[0] % 2 == 0){
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    if(inArr2[j] != inArr1[i]){
                        continue;
                    }
                    else{
                        outArr[index] = inArr1[i];
                        index++;
                    }
                }
            }
        }
        else{
            outArr[index] = 1;
        }

        for(int i = 0; i< size; i++) {
            System.out.println(outArr[i]);
        }

        in.close();
    }
}
