package basicpro;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number end:");
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			 fact*=i;
		}
		System.out.println(fact);
	}

}
