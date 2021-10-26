package room1;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Problem3 {
    //if a,e,i,o,u or A,E,I,O,U is vowel using || "OR" if condition, else if is consonent and else is invalid entry
    void findVowelorConsonent(char ch){
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            System.out.println("Entered Character  : " +ch+" - is Vowel " );
        } else if ((ch >= 'a' && ch <= 'z') ||(ch>='A' && ch<='Z')) {
            System.out.println("Entered Character is " +ch+" is Consonent");
        }else
            System.out.println("Wrong Entry");
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char in=s1.next().charAt(0);

        Problem3 obj=new Problem3();    //creating object
        obj.findVowelorConsonent(in);    //method call in main
    }

}
