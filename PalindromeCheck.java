package basicpro;
import java.util.Scanner;
public class PalindromeCheck {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number");
	int n=scan.nextInt();
	PalindromeCheckApp obj=new PalindromeCheckApp();
	int dis=obj.method(n);
	System.out.println(dis);
	if(n==dis)
	{
		System.out.println("This is palindrom");
	}
	else
		System.out.println("Not palindrom");
}
}
