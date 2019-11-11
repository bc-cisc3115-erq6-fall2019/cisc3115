/* Class Exercise
*  Take two numbers and produce its sum
*  CISC 3115, Brooklyn College
*  Author: Katherine Chuang
*/

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter two numbers: ");

        if (keyboard.hasNextInt()) {
            int firstNum = keyboard.nextInt();
            if (keyboard.hasNextInt()) {
                int secondNum = keyboard.nextInt();
                System.out.println(firstNum + secondNum);
            } else if (keyboard.hasNextDouble()) {
                double secondNum = keyboard.nextDouble();
                // print sum
                System.out.println("Here's the sum");
            } else { // error
                System.out.println("Error");
            }
            
        } else if (keyboard.hasNextDouble()) {
            double firstNum = keyboard.nextDouble();
            // don't care type because output will be double
            double secondNum = keyboard.nextDouble();
            System.out.println(firstNum + secondNum);
        // } else {
        //     // error
        //     System.out.println("Error");
        // }

        } else {
            System.out.println("Looks like there's something wrong with your first number...");
        }

        keyboard.close();
    }
}
