package room1;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Problem9 {
  static void fibonacci(int N){
      int num1=0, num2=1;

      int counter=0;

      while(counter<N){
          System.out.println(num1 + " ");

          int num3= num1+num2;
          num1=num2;
          num2=num3;
          counter =counter+1;
      }

  }

    public static void main(String[] args) {
        int N=10;

        fibonacci(N);
    }







    }

