package assignment_set_3;

import java.util.Scanner;

public class EmailGeneration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fName = in.nextLine();
        String lName = in.nextLine();
        String passKey = in.nextLine();
        String outStr = "";

        if(fName.length() != lName.length()){
            if(fName.length() > 4 && lName.length() > 4 && !(passKey.isEmpty())){
                outStr = fName.substring(0,4).toLowerCase() + "." +
                        lName.substring(lName.length()-3) +
                        passKey + "@swiftfood.com";
            }
            else{
                outStr = "Invalid";
            }
        }
        else{
            outStr = "Invalid";
        }
        System.out.println(outStr);
        in.close();
    }
}
