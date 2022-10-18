/*
7. Write a program to print prime numbers from 2 to n
*  */

package If_else_loop;

import java.util.Scanner;

class FindPrimeNumber
{
    // Driver code
    public static void main (String[] args)
    {
        System.out.println("give the value of n");
        Scanner inputValue = new Scanner(System.in);
        int newNumber = inputValue.nextInt();

        System.out.println("so here is the list of prime numbers from 2 to n");
        for(int i=1; i<=newNumber; i++){

            if(checkPrimeOrNot(i)) {

                System.out.print(i+ ", ");
            }
        }

    }

    static boolean checkPrimeOrNot(int n){
        if(n==1||n==0)
            return false;


        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }

        return true;
    }
}