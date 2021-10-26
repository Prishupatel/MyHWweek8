package room1;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Problem13 {
    public boolean hasSharedDigit(int a , int b){
        boolean answer =false;
        int leftA=a/10;
        int rightA=a%10;
        int leftB=b/10;
        int rightB=b%10;

        if(leftA==leftB || leftA==rightB || rightA==leftB || rightA==rightB && leftA>=9 && leftA<99 && rightB>=9 && rightB<99){
            answer =true;
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem13 obj=new Problem13();
        obj.hasSharedDigit(12,23);
        obj.hasSharedDigit(9,99);
        obj.hasSharedDigit(15,55);
        System.out.println(obj.hasSharedDigit(12,23));
        System.out.println(obj.hasSharedDigit(9,99));
        System.out.println(obj.hasSharedDigit(15,55));
        System.out.println(obj.hasSharedDigit(10,25));
        System.out.println(obj.hasSharedDigit(999,199));
    }


}



