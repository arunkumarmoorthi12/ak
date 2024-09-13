package basicpro;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two number :");
		int b=scan.nextInt(),a=scan.nextInt();
		
	GcdApp obj=new GcdApp();
	int g=obj.method(b, a);
	System.out.println("the value of GCd:"+g);
	

	}

}
