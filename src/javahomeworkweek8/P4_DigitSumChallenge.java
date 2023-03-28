package javahomeworkweek8;

import java.util.Scanner;
public class P4_DigitSumChallenge {
    public static void  sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number != 0) {
                int digit = number % 10;
                number = number / 10;
                sum += digit;
            }
            System.out.println("Sum of number :" + sum);
        } else {
            System.out.println("Invalid number");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        sumDigits(number);
        scanner.close();
    }

}


