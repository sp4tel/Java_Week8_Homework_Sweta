package javahomeworkweek8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class P3_PrintVowelOrConsonant {

    public static void alphabet() {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a single character: ");
        String str = input.nextLine();


        if (str.length() != 1) {
            System.out.println("Error: Please enter a single character.");
            return;
        }


        char ch = Character.toUpperCase(str.charAt(0));

        if (ch < 'A' || ch > 'Z') {
            System.out.println("Error: Please enter a letter.");
            return;
        }


        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }

        input.close();
    }

    public static void main(String[] args) {
        alphabet();
    }

}
