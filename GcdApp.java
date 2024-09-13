package basicpro;

public class GcdApp {
public int method(int b,int a)
{
	while(b!=0) {
		int nextnum=a%b;
		a=b;
		b=nextnum;
		}
	int y=a;
	return y;
}
}
