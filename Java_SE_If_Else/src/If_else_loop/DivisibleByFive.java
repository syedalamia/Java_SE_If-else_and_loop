/*
5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
 */

package If_else_loop;

public class DivisibleByFive {
    public static void main(String[] args) {
        int sum = 0,finalValue = 100;
        for (int i = 1; i <= finalValue; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("sum of the numbers from 1 to 100 which are divisible by 5 :" + sum);
    }
}