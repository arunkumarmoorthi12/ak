package basicpro;
public class ArmStrong {
	public static int method(int n,int c) { //153
		int mul=1,sum=0,count=c;
		 while(n!=0) {
			   int rev=n%10;  //take reminder   3
			   while(count!=0) {
			    mul=mul*rev;  //multiple
				 count--;}
		          sum=sum+mul;   //add
			      count=c;
			      n= n/10;
			      mul=1;
			}
		 
		 return sum;
			//System.out.println(sum);
				}
			}

