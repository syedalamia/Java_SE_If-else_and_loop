/*
6. Write  a program to find the factorial of a given number
* */
package If_else_loop;

import java.util.Scanner;

class FactorialOfGivenNumber {
    public static void main(String args[]){
        int i,calculatedFactorial=1,number;
        Scanner sc = new Scanner(System.in);
        number= sc.nextInt( );

        for(i=1;i<=number;i++){
            calculatedFactorial=calculatedFactorial*i;
        }
        System.out.println("Factorial of the given  "+number+" is: "+calculatedFactorial);
    }
}  