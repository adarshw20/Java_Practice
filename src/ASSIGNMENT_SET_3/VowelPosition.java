package ASSIGNMENT_SET_3;

import java.util.Scanner;

public class VowelPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] wordArr =  new String[size];
        sc.nextLine();
        for(int i =0; i < size; i++){
            wordArr[i] = sc.nextLine();
        }
        sc.close();
        String vowelPos = "";

        for(String word : wordArr){
            for(int i = 0; i < word.length(); i++){
                char ch = Character.toLowerCase(word.charAt(i));
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelPos += i+1 +"-";
                }
            }
        }

        if(vowelPos.length() > 0){
            vowelPos =vowelPos.substring(0, vowelPos.length()-1);
            System.out.println(vowelPos);
        }
        else{
            System.out.println("No Vowel");
        }
    }
}
