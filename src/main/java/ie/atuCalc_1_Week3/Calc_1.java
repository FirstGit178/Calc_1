package ie.atuCalc_1_Week3;

import java.util.Scanner;

public class Calc_1 {

    public static void main(String[] args) {
        //Tasks to perform
        // 1 Prompt the user for a number
        // 2 Prompt the user for a second number
        // 3 Prompt for addition function
        // 4 Display the total to the screen
        Scanner scan1 = new Scanner(System.in);
        // Please enter first number
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        // Please enter second number
        System.out.println("Please enter second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

    }
}
