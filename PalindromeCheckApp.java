package basicpro;

public class PalindromeCheckApp {
	public int method(int n) {
	int rem=0;
	int res=0;
	while(n!=0) {//true
		rem=n%10;
		res=res*10+rem;
		n=n/10;
		//remove last num
		}
	int c=res;
	return c;
	}
}
