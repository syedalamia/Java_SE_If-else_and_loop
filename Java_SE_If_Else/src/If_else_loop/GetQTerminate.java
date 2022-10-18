package If_else_loop;
/*
9. Write a program to sum of user input until users input ‘q’ from keyboard
*/


import java.util.*;
public class GetQTerminate {
    public static void main(String[] args) {
        int  sum = 0;
        char inputCharacter='a';
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Give your preferable input :");
            inputCharacter=sc.next().charAt(0);
            if(inputCharacter=='q'){
                System.out.println("we're going to terminate the program");
                break;
            }
            else{
                int a=Character.getNumericValue(inputCharacter);
                sum=sum+a;
            }

        }
        System.out.println("the sum of the given input is"+" "+sum);

    }
}