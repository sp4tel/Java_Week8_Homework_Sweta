package javahomeworkweek8;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class P14_DiamondPatternUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = input.nextInt();


        int i = 1;
        int spaces = rows / 2;
        int stars = 1;

        while (i <= rows) {
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }

            j = 1;
            while (j <= stars) {
                System.out.print("*");
                j++;
            }
            System.out.println();

            if (i <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }

            i++;
        }
        input.close();
    }
}
