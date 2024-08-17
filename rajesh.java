package Mondal;

import java.util.Scanner;

/**
 *
 * @author rajes
 */
public class rajesh {

    public static void main(String[] args) {

//        int i;
        int userInput;


        System.out.println("For Loop Printing Number? ");
        Scanner input = new Scanner(System.in);
        userInput=input.nextInt();
        
//         int userInput=i;
        for (int i = 1; i <= userInput; i++) {
            System.out.println(i);
        }
        

    }

}
