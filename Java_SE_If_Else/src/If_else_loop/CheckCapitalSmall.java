/*
* 1. Write a program to check if inputted letter is small or capital
 */
package If_else_loop;
import java.util.Scanner;
public class CheckCapitalSmall {
    public static void main(String args[]){
        char inputCharacter;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please give your input here: ");
        inputCharacter=scan.next().charAt(0);
        if(inputCharacter>='A' && inputCharacter<='Z'){
            System.out.println(inputCharacter+" the given character is an uppercase character");
        }
        else if(inputCharacter>='a' && inputCharacter<='z'){
            System.out.println(inputCharacter+" the given character is an lowercase character ");
        }
        else{
            System.out.println(inputCharacter+" is not a character");
        }
    }
}