//Factorial method
package factorial;

import java.util.Scanner;

public class Factorial {
  
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer : ");
        int n = input.nextInt();
        System.out.println("Factorial of "+ n +"is"+factorial(n));
    }
    public static long factorial(int n){
            if (n == 0) //base case
    {
        return 1;
    } else {
    return n * factorial(n -1); // recursive call 
}
}
}
 
