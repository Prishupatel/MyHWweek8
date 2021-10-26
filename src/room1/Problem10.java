package room1;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Problem10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n, count=0,a,b,c, sum=0;
        System.out.println("Enter any number : ");
        n= s.nextInt();
        a=n;
        c=n;
        while (a>0){
            a=a/10;
            count++;
        }
        while (n>0){
            b=n%10;
            sum=(int) (sum+Math.pow(b,count));
            n=n/10;
        }
        if(sum==c){
            System.out.println("Entered nNUmber is Armstrong");
        }else{
            System.out.println("Entered Number is not Armstrong");
        }
    }
}
