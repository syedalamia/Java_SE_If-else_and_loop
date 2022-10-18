
/*
4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
 */
package If_else_loop;

import java.util.*;
class AtmBooth {
    public static void main(String[] args) {

        int withdrawAmount, initialBalance;
        System.out.print( "Please given an initial initialBalance to the atm booth" );
        Scanner sc = new Scanner(System.in);
        initialBalance = sc.nextInt( );

        System.out.println( "press w for Withdraw" );
        System.out.println( "press b for Balance Check" );
        System.out.println( "press e for EXIT" );




        while(true)
        {

            System.out.print( "press the button you want to see the result:" );
            int pressedButton =  sc.next().charAt(0);
            switch( pressedButton )
            {
                case 'w':
                    System.out.print( "Enter the amount to be withdrawn :" );
                    withdrawAmount = sc.nextInt();
                    initialBalance= getWithdraw( initialBalance, withdrawAmount);
                    break;

                case 'b':
                    getCurrentBalance( initialBalance );
                    System.out.println(" ");
                    break;

                case 'e':
                    System.exit( 0 );
            }
        }
    }

    public static void getCurrentBalance(int initialBalance)
    {
        System.out.println(" The Present balance of atm booth : " + initialBalance);
        System.out.println();
    }

    public static int getWithdraw(int initialBalance, int withdrawAmount)
    {

        System.out.println("Amount I want to withdraw: " + withdrawAmount);
        if (initialBalance >= withdrawAmount) {
            initialBalance = initialBalance - withdrawAmount;
            getCurrentBalance( initialBalance );
        }
        else {
            System.out.println( "Sorry! the initialBalance is insufficient, please try with another amount" );
            System.out.println( );
        }
        return initialBalance;
    }


}