package basicpro;
import java.util.Scanner;
public class ArmStrongApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter armstrong number:");
	int n=scan.nextInt();
	int count=0;
	int rem=n;
	while(rem!=0) {
		rem=rem/10;
			count++;
		}
	int r=ArmStrong.method(n,count);
	if(r==n)
    System.out.println("equal it is armstrong number");
	else
		System.out.println("not armstrong number");
}}