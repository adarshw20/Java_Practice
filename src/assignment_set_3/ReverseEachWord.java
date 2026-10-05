package assignment_set_3;

import java.util.Scanner;

public class ReverseEachWord {
    public static String reverse(String str){
        String out = "";
        String[] words = str.split(" ");

        for(String word : words){
            for(int i = word.length()-1; i >= 0; i--){
                out +=  word.charAt(i);
            }
            out += " ";
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(reverse(str));
        in.close();
    }
}
