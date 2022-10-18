/*
10. Write a program to enter the numbers till the user wants and at the end,
 the program should display the largest and smallest numbers user entered
*/
package If_else_loop;

import java.util.Scanner;
public class MaxMinDeterminer
{
    public static void main(String[] args)
    {

        int newNumber=0;
        char choiceYesNo='y';
        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        Scanner inputValue = new Scanner(System.in);

        do
        {
            System.out.print("Enter a new newNumber:  ");
            newNumber = inputValue.nextInt();

            if(newNumber > maximumNumber)
            {
                maximumNumber = newNumber;
            }
            if(newNumber < minimumNumber)
            {
                minimumNumber = newNumber;
            }

            System.out.print("Do you want to continue this loop (press y/n) ? ");
            choiceYesNo = inputValue.next().charAt(0);

        }
        while(choiceYesNo=='y' || choiceYesNo == 'Y');

        System.out.println("After terminating the largest value : " + maximumNumber);
        System.out.println("After terminating the largest value: " + minimumNumber);
    }
}