package room1;


import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Problem6 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        c = in.nextInt();

        for(a=1;a<=c;a++)
        {
            for(b=1;b<=a;b++)
                System.out.print(b);
            System.out.println("");


        }
    }
}
