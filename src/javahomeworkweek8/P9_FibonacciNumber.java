package javahomeworkweek8;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P9_FibonacciNumber {


    public static void fibonacciNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci Series upto number  you want:");
        int n = input.nextInt();

        int num = 8;
        int first = 1;
        int second = 1;


        for (int i = 1; i <= num; ++i) {
            System.out.print(first + " ");


            int next = first+ second;
            first = second;
            second = next;
    }
        input.close();



    }
    public static void main(String[] args){

        fibonacciNumber();
    }

}
