/*
* Name: Kush Patel
* Date: 11/24/2020
* Purpose: This program exctracts words seperated with whitespaces and assigns
*          each word into another variable
*/

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        
        // checks for any whitespace at the starting of the string
        int index = name.indexOf(" ");
        if(index == -1){
            System.out.println("Start you name without white space");
        } else {
            // extracts the first and second word from the string
            int index1 = name.indexOf(" ", index + 1);
            if (index1 == -1) {
                String firstName = name.substring(0, index);
                String lastName = name.substring(index + 1);
                System.out.println("First name:  " + firstName);
                System.out.println("Last name:   " + lastName);                
            } else {
                //extracts the last word in the string
                int index2 = name.indexOf(" ", index1 + 1);
                if (index2 == -1) {
                    String firstName = name.substring(0, index);
                    String middleName = name.substring(index + 1, index1);
                    String lastName = name.substring(index1 + 1);
                //displays the output
                    System.out.println("First name:   " + firstName);
                    System.out.println("Middle name:  " + middleName);
                    System.out.println("Last name:    " + lastName);                                    
                }
                else {
                    System.out.println("Name not in valid format.");
                }
            }
        }
    }
}
