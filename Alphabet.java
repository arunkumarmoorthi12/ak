package basicpro;
import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
 for(int i=0;i<5;i++) {
	 char ch='a';
	 
	 for(int j=0;j<i;j++) {
		 System.out.print(ch);
		 ch++;
	 }
	 System.out.println();
 }
}
}
