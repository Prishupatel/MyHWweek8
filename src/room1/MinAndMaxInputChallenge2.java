package room1;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int number;
        boolean isValid;

        while(true){
            System.out.println("Enter a Number: ");
            number= scan.nextInt();
            isValid= scan.hasNextInt();

            if(!isValid){
                break;
            }if(number<min){
                min=number;
            }if(number>max){
                max=number;
            }

        }

        System.out.println("Max = " +max);
        System.out.println("Min = " +min);
        scan.close();
    }

}
