package assignment_set_4;

import java.util.Scanner;

public class Highestoccurence {
    public static int findHighestOccurence(String str){

        int max = 0;
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            int count = 1;
            for(int j = i+1; j < str.length(); j++){
                if((str.charAt(j)) == ch){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(findHighestOccurence(str));
        in.close();
    }
}
