package basicpro;
import java.util.Scanner;
public class PrimeNumberApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int count=0;
	System.out.println("enter the number");
	int num=scan.nextInt();
	for(int i=3;i<num;i++) {
		int re=PrimeNuber.method(num,i);
		if(re>0) {
			System.out.println("it is prime "+re);
			count++;
		}
		System.out.println("not prime "+re);
		}
	
}
}
