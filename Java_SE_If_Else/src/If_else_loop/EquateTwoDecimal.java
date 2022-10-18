package If_else_loop;/*
* Input 2 decimal numbers and check if they are both same or different up to
*  two decimal places. E.g 120.546 & 120.241
*
* */

import java.util.Scanner;
public class EquateTwoDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = input.nextDouble();
        System.out.print("Input second number: ");
        double num2 = input.nextDouble();
        input.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}