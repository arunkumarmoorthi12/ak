package basicpro;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=scan.nextInt();
  FibonacciApp obj=new FibonacciApp();
        obj.method(n);
        //System.out.println(res);
  
	
 }
}
