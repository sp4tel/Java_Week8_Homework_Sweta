package javahomeworkweek8;

import java.util.Scanner;

/**
 *2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class P2_MinAndMaxInputChallenge {

    public static void myMethod() {
        Scanner input = new Scanner(System.in);


        Double minNum = null;
        Double maxNum = null;


        while (true) {


            System.out.print("Enter a number: ");
            String numStr = input.nextLine();


            if (numStr.equals("Done")) {
                break;
            }

            Double num;
            try {
                num = Double.parseDouble(numStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                break;
            }


            if (minNum == null || num < minNum) {
                minNum = num;
            }
            if (maxNum == null || num > maxNum) {
                maxNum = num;
            }
        }
        if (minNum != null) {
            System.out.println("Minimum number entered: " + minNum);
        }
        if (maxNum != null) {
            System.out.println("Maximum number entered: " + maxNum);
        }

        input.close();
    }

    public static void main(String[] args) {

        myMethod();
    }


}
